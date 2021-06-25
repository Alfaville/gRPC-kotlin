package org.example.client

import com.proto.calculator.Calculator
import com.proto.calculator.CalculatorManyTimesRequest
import com.proto.calculator.CalculatorManyTimesResponse
import com.proto.calculator.CalculatorRequest
import com.proto.calculator.CalculatorServiceGrpc
import com.proto.calculator.LongCalculatorRequest
import com.proto.calculator.LongCalculatorResponse
import com.proto.calculator.PrimeNumber
import com.proto.calculator.PrimeNumberDecompositionRequest
import com.proto.dummy.GreetServiceGrpc
import com.proto.dummy.Greeting
import com.proto.dummy.GreetingRequest
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
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
        doClientStreamingCall(channel)

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
        for(x in 1..4) {
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

}

fun main(args: Array<String>) {
    val main = Client()
    main.runGrpcClient()
}