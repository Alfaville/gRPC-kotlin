package org.example.client

import com.proto.calculator.Calculator
import com.proto.calculator.CalculatorRequest
import com.proto.calculator.CalculatorServiceGrpc
import com.proto.dummy.GreetServiceGrpc
import com.proto.dummy.Greeting
import com.proto.dummy.GreetingRequest
import io.grpc.ManagedChannelBuilder

class Client

fun main(args: Array<String>) {
    println("Starting gRPC")

    val channel = ManagedChannelBuilder.forAddress("localhost", 50051)
        .usePlaintext() //not use this in prod
        .build()

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

    channel.shutdown()
}