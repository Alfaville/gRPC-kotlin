package org.example.server

import com.proto.calculator.CalculatorRequest
import com.proto.calculator.CalculatorResponse
import com.proto.calculator.CalculatorServiceGrpc
import io.grpc.stub.StreamObserver

class CalculatorService: CalculatorServiceGrpc.CalculatorServiceImplBase() {

    override fun calculator(
        request: CalculatorRequest,
        responseObserver: StreamObserver<CalculatorResponse>
    ) {
        var calculator = request.calculator

        val sumResult = calculator.x + calculator.y
        val calculatorResponse = CalculatorResponse.newBuilder().setResult(sumResult).build()
        responseObserver.onNext(calculatorResponse)
        responseObserver.onCompleted()
    }
}