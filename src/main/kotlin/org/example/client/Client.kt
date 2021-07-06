package org.example.client

import com.proto.calculator.Calculator
import com.proto.calculator.CalculatorManyTimesRequest
import com.proto.calculator.CalculatorRequest
import com.proto.calculator.CalculatorServiceGrpc
import com.proto.calculator.FindMaxNumberRequest
import com.proto.calculator.FindMaxNumberResponse
import com.proto.calculator.LongCalculatorRequest
import com.proto.calculator.LongCalculatorResponse
import com.proto.calculator.PrimeNumber
import com.proto.calculator.PrimeNumberDecompositionRequest
import com.proto.calculator.SquareRootRequest
import com.proto.dummy.GreetServiceGrpc
import com.proto.dummy.Greeting
import com.proto.dummy.GreetingEveryoneRequest
import com.proto.dummy.GreetingEveryoneResponse
import com.proto.dummy.GreetingRequest
import com.proto.dummy.GreetingWithDeadlineRequest
import io.grpc.Deadline
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import io.grpc.Status
import io.grpc.StatusRuntimeException
import io.grpc.stub.StreamObserver
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit

class Client {

    fun runGrpcClient() {
        val channel = ManagedChannelBuilder.forAddress("localhost", 50051)
            .usePlaintext() //not use this in prod
            .build()
//        doUnaryCall(channel)
//        doServerStreamingCall(channel)
//        doClientStreamingCall(channel)
//        doBiStreamCall(channel)
//        doBiStreamCallMaxNumber(channel)
//        errorCall(channel)
        doUnaryCallWithDeadline(channel)

        channel.shutdown()
    }

    private fun doUnaryCall(channel: ManagedChannel) {
        println("Starting gRPC")

//    val syncClient = GreetServiceGrpc.newBlockingStub(channel)
//    val asyncClient = DummyServiceGrpc.newFutureStub(managerChanel)

        //Create a greet service client (blocking - synchronous)
        val greetServiceGrpc = GreetServiceGrpc.newBlockingStub(channel)

        //created a protocol buffer greeting message
        val greeting = Greeting.newBuilder()
            .setFirstName("Felipe")
            .setLastName("Alfaville")
            .build()

        val greetRequest = GreetingRequest.newBuilder()
            .setGreeting(greeting)
            .build()

        //call the RPC get back a response (protocol buffer)
        val greetingResponse = greetServiceGrpc.greet(greetRequest)

        println("Result Greeting: ${greetingResponse.result}")

        val calculatorServiceGrpc = CalculatorServiceGrpc.newBlockingStub(channel)
        val calculator = Calculator.newBuilder()
            .setX(30)
            .setY(10)
            .build()

        val calculatorRequest = CalculatorRequest.newBuilder()
            .setCalculator(calculator)
            .build()

        val calculatorResponse = calculatorServiceGrpc.calculator(calculatorRequest)

        println("Result calculator: ${calculatorResponse.result}")

        val calculatorManyTimesRequest = CalculatorManyTimesRequest.newBuilder()
            .setCalculator(Calculator.newBuilder().setX(10).setY(5).build())
            .build()

        calculatorServiceGrpc.calculatorManyTimes(calculatorManyTimesRequest)
            .forEachRemaining { println(it.result) }
    }

    private fun doServerStreamingCall(channel: ManagedChannel) {
        println("-".repeat(10))
        println("Prime Number Decompostion")
        val primeNumberServiceGrpc = CalculatorServiceGrpc.newBlockingStub(channel)

        val primeNumberDecomposiotionRequest = PrimeNumberDecompositionRequest.newBuilder()
            .setPrimeNumber(PrimeNumber.newBuilder().setX(120).build())
            .build()

        primeNumberServiceGrpc.primeNumberDecomposition(primeNumberDecomposiotionRequest)
            .forEachRemaining { println(it.result) }

    }

    private fun doClientStreamingCall(channel: ManagedChannel) {
        println("Do client streaming call")

        val latch = CountDownLatch(1)

        val asyncClient = CalculatorServiceGrpc.newStub(channel)
        val requestObserver = asyncClient.longCalculator(object : StreamObserver<LongCalculatorResponse> {
            override fun onNext(value: LongCalculatorResponse) {
                println("Received a response form the server")
                println("value: $value")
            }

            override fun onError(t: Throwable?) {
                TODO("Not yet implemented")
            }

            override fun onCompleted() {
                latch.countDown()
            }

        }
        )

        println("Sending messaging")
        for (x in 1..4) {
            requestObserver.onNext(
                LongCalculatorRequest.newBuilder()
                    .setCalculator(Calculator.newBuilder().setX(x.toLong()).build())
                    .build()
            )
        }
        //we tell the server that the client is done sending data
        requestObserver.onCompleted()
        latch.await(3L, TimeUnit.SECONDS)
    }

    private fun doBiStreamCall(channel: ManagedChannel) {
        println("Do Bi streaming call")

        val asyncClient = GreetServiceGrpc.newStub(channel)
        val requestObserver = asyncClient.greetEveryone(object : StreamObserver<GreetingEveryoneResponse> {
            override fun onNext(value: GreetingEveryoneResponse) {
                println("Response from service ${value.result}")
            }

            override fun onError(t: Throwable?) {
                TODO("Not yet implemented")
            }

            override fun onCompleted() {
                println("Server is done")
            }
        })

        listOf("Felipe", "Alfa", "Marc", "Herbert", "Smith").forEach {
            requestObserver.onNext(
                GreetingEveryoneRequest.newBuilder()
                .setGreeting(Greeting.newBuilder().setFirstName(it).build())
                .build()
            )
        }
        requestObserver.onCompleted()

    }

    private fun doBiStreamCallMaxNumber(channel: ManagedChannel) {
        println("Do Bi streaming call")

        val asyncClient = CalculatorServiceGrpc.newStub(channel)
        val requestObserver = asyncClient.findMaxApiEveryone(object : StreamObserver<FindMaxNumberResponse> {
            override fun onNext(value: FindMaxNumberResponse) {
                println("Response from service ${value.maximum}")
            }

            override fun onError(t: Throwable?) {
                println(t!!.message)
            }

            override fun onCompleted() {
                println("Server is done")
            }
        })

        listOf(3,5,17,9,8,30,12).forEach {
            println("Number: $it")
            requestObserver.onNext(
                FindMaxNumberRequest.newBuilder()
                .setNumber(it)
                .build()
            )
        }
        requestObserver.onCompleted()

    }

    private fun errorCall(channel: ManagedChannel) {
        val blockingStub = CalculatorServiceGrpc.newBlockingStub(channel)
        val number = -1

        try {
            blockingStub.squareRoot(
                SquareRootRequest.newBuilder().setNumber(number).build()
            )
        } catch (e: StatusRuntimeException) {
            println("Go an exception for square root!")
            e.printStackTrace()
        }
    }

    private fun doUnaryCallWithDeadline(channel: ManagedChannel) {
        val blockingStub = GreetServiceGrpc.newBlockingStub(channel)

        try {
            println("Sending a request with a deadline of 3000 ms")
            val response = blockingStub.withDeadline(
                Deadline.after(3000, TimeUnit.MILLISECONDS)
            ).greetWithDeadLines(
                GreetingWithDeadlineRequest.newBuilder().setGreeting(
                    Greeting.newBuilder().setFirstName("Felipe").build()
                ).build()
            )

            println(response.result)
        } catch (e: StatusRuntimeException) {
            if(e.status == Status.DEADLINE_EXCEEDED) {
                println("Deadline has been exceeded, we don't want the response")
            } else
                e.printStackTrace()
        }

        try {
            println("Sending a request with a deadline of 100 ms")
            val response = blockingStub.withDeadline(
                Deadline.after(100, TimeUnit.MILLISECONDS)
            ).greetWithDeadLines(
                GreetingWithDeadlineRequest.newBuilder().setGreeting(
                    Greeting.newBuilder().setFirstName("Alfaville").build()
                ).build()
            )

            println(response.result)
        } catch (e: StatusRuntimeException) {
            if(e.status == Status.DEADLINE_EXCEEDED) {
                println("Deadline has been exceeded, we don't want the response")
            } else
                e.printStackTrace()
        }

    }

}

fun main(args: Array<String>) {
    val main = Client()
    main.runGrpcClient()
}