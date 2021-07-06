package org.example.server

import io.grpc.ServerBuilder

class Server

fun main(args: Array<String>) {
    println("Starting gRPC");

    val server = ServerBuilder.forPort(50051)
        .addService(GreetService())
        .addService(CalculatorService())
        .build()

    server.start()

    Runtime.getRuntime().addShutdownHook(Thread())

    Runtime.getRuntime().addShutdownHook(Thread {
        println("Received shutdown request")
        server.shutdown()
        println("Successfully stopped the server")
    })

    server.awaitTermination()
}