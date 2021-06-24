package org.example.server

import com.proto.calculator.CalculatorManyTimesRequest
import com.proto.calculator.CalculatorManyTimesResponse
import com.proto.calculator.CalculatorRequest
import com.proto.calculator.CalculatorResponse
import com.proto.calculator.CalculatorServiceGrpc
import com.proto.calculator.PrimeNumberDecompositionRequest
import com.proto.calculator.PrimeNumberDecompositionResponse
import io.grpc.stub.StreamObserver

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
}