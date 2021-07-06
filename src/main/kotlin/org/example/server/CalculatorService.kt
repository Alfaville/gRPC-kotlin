package org.example.server

import com.proto.calculator.CalculatorManyTimesRequest
import com.proto.calculator.CalculatorManyTimesResponse
import com.proto.calculator.CalculatorRequest
import com.proto.calculator.CalculatorResponse
import com.proto.calculator.CalculatorServiceGrpc
import com.proto.calculator.FindMaxNumberRequest
import com.proto.calculator.FindMaxNumberResponse
import com.proto.calculator.LongCalculatorRequest
import com.proto.calculator.LongCalculatorResponse
import com.proto.calculator.PrimeNumberDecompositionRequest
import com.proto.calculator.PrimeNumberDecompositionResponse
import com.proto.calculator.SquareRootRequest
import com.proto.calculator.SquareRootResponse
import io.grpc.Status
import io.grpc.stub.ServerCalls
import io.grpc.stub.StreamObserver
import kotlin.math.sqrt

class CalculatorService: CalculatorServiceGrpc.CalculatorServiceImplBase() {

    override fun calculator(
        request: CalculatorRequest,
        responseObserver: StreamObserver<CalculatorResponse>
    ) {
        println("calculator")
        var calculator = request.calculator

        val sumResult = calculator.x + calculator.y
        println("Sum of ${calculator.x} + ${calculator.y} is equals $sumResult")
        val calculatorResponse = CalculatorResponse.newBuilder().setResult(sumResult).build()
        responseObserver.onNext(calculatorResponse)
        responseObserver.onCompleted()
    }

    override fun calculatorManyTimes(
        request: CalculatorManyTimesRequest,
        responseObserver: StreamObserver<CalculatorManyTimesResponse>
    ) {
        println("calculatorManyTimes")
        var calculator = request.calculator

        try {
            for (x in 1..10) {
                println(x)
                val sumResult = calculator.x + calculator.y
                println("Sum of ${calculator.x} + ${calculator.y} is equals $sumResult")
                val calculatorManyTimeResponse = CalculatorManyTimesResponse.newBuilder().setResult(sumResult).build()
                responseObserver.onNext(calculatorManyTimeResponse)
                Thread.sleep(1_000)
            }
        } catch (e: InterruptedException) {
            e.printStackTrace()
        } finally {
            responseObserver.onCompleted()
        }
    }

    override fun primeNumberDecomposition(
        request: PrimeNumberDecompositionRequest,
        responseObserver: StreamObserver<PrimeNumberDecompositionResponse>
    ) {
        println("Prime number decomposition")
        val primeNumber = request.primeNumber
        var prime = primeNumber.x
        var k = 2
        while (prime > 1) {
            if(prime.mod(k) == 0) {
                println(k)
                prime /= k
            } else {
                k += 1
            }
            val primeNumberDecompositionResponse = PrimeNumberDecompositionResponse.newBuilder().setResult(prime).build()
            responseObserver.onNext(primeNumberDecompositionResponse)
        }
        responseObserver.onCompleted()
    }

    override fun longCalculator(
        responseObserver: StreamObserver<LongCalculatorResponse>
    ): StreamObserver<LongCalculatorRequest> {

        return object : StreamObserver<LongCalculatorRequest> {

            var result = 0L
            var count = 0
            override fun onNext(value: LongCalculatorRequest) {
                result += value.calculator.x
                ++count
            }

            override fun onError(t: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onCompleted() {
                responseObserver.onNext(
                    LongCalculatorResponse.newBuilder()
                        .setResult(result.div(count.toDouble()))
                        .build()
                )
                responseObserver.onCompleted()
            }

        }
    }

    override fun findMaxApiEveryone(
        responseObserver: StreamObserver<FindMaxNumberResponse>
    ): StreamObserver<FindMaxNumberRequest> {

        println("find Max Api Everyone")
        return object: StreamObserver<FindMaxNumberRequest> {

            val currentMaximum = 0

            override fun onNext(value: FindMaxNumberRequest) {
                var currentNumber = value.number
                if(currentNumber > currentMaximum) {
                    currentNumber = currentMaximum
                    responseObserver.onNext(
                        FindMaxNumberResponse.newBuilder()
                            .setMaximum(currentNumber)
                            .build()
                    )
                }
            }

            override fun onError(t: Throwable) {
                responseObserver.onCompleted()
            }

            override fun onCompleted() {
                responseObserver.onNext(
                    FindMaxNumberResponse.newBuilder()
                        .setMaximum(currentMaximum)
                        .build()
                )
                responseObserver.onCompleted()
            }

        }
    }

    override fun squareRoot(
        request: SquareRootRequest,
        responseObserver: StreamObserver<SquareRootResponse>
    ) {
        val number = request.number
        if(number >= 0) {
            val numberRoot = sqrt(number.toDouble())
            responseObserver.onNext(
                SquareRootResponse.newBuilder()
                    .setNumberRoot(numberRoot)
                    .build()
            )
        } else {
            // we construct the exception
            responseObserver.onError(
                Status.INVALID_ARGUMENT
                    .withDescription("The number being send is not positive")
                    .augmentDescription("The number: $number")
                    .asRuntimeException()
            )
        }
    }

}