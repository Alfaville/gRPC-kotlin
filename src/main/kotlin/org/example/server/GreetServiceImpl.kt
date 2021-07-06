package org.example.server

import com.proto.dummy.GreetServiceGrpc
import com.proto.dummy.Greeting
import com.proto.dummy.GreetingEveryoneRequest
import com.proto.dummy.GreetingEveryoneResponse
import com.proto.dummy.GreetingRequest
import com.proto.dummy.GreetingResponse
import com.proto.dummy.GreetingWithDeadlineRequest
import com.proto.dummy.GreetingWithDeadlineResponse
import io.grpc.Context
import io.grpc.stub.ServerCalls
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

    override fun greetEveryone(
        responseObserver: StreamObserver<GreetingEveryoneResponse>
    ): StreamObserver<GreetingEveryoneRequest> {

        val requestObserver = object: StreamObserver<GreetingEveryoneRequest> {
            override fun onNext(value: GreetingEveryoneRequest) {
                val result = "Hello ${value.greeting.firstName}"
                val greetingEveryoneResponse = GreetingEveryoneResponse.newBuilder()
                    .setResult(result)
                    .build()

                responseObserver.onNext(greetingEveryoneResponse)
            }

            override fun onError(t: Throwable?) {
                TODO("Not yet implemented")
            }

            override fun onCompleted() {
                responseObserver.onCompleted()
            }

        }
        return super.greetEveryone(responseObserver)
    }

    override fun greetWithDeadLines(
        request: GreetingWithDeadlineRequest,
        responseObserver: StreamObserver<GreetingWithDeadlineResponse>
    ) {

        val current = Context.current()
        for(x in 1 until 3) {
            if(!current.isCancelled) {
                println("Sleep for 100 ms")
                Thread.sleep(100)
            } else
                return
        }

        println("Send response")
        responseObserver.onNext(
            GreetingWithDeadlineResponse.newBuilder().setResult("Result ${request.greeting.firstName}").build()
        )

        responseObserver.onCompleted()
    }

}