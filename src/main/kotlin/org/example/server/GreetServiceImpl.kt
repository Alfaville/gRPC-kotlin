package org.example.server

import com.proto.dummy.GreetServiceGrpc
import com.proto.dummy.Greeting
import com.proto.dummy.GreetingRequest
import com.proto.dummy.GreetingResponse
import io.grpc.stub.StreamObserver

class GreetServiceImpl : GreetServiceGrpc.GreetServiceImplBase() {

    override fun greet(
        request: GreetingRequest,
        responseObserver: StreamObserver<GreetingResponse>
    ) {
        //extract the field we need
        val greeting: Greeting = request.greeting

        //create the response
        val result = "Hello ${greeting.firstName}"
        val greetResponse = GreetingResponse.newBuilder().setResult(result).build()

        //send the response
        responseObserver.onNext(greetResponse)

        //Complete the gRPC call
        responseObserver.onCompleted()
    }

}