package org.example.server

import io.grpc.ServerBuilder
import java.io.File

class Server

fun main(args: Array<String>) {
    println("Starting gRPC");

    //plain text server
//    val server = ServerBuilder.forPort(50051)
//        .addService(GreetService())
//        .addService(CalculatorService())
//        .build()

    //secure server
    val server = ServerBuilder.forPort(50051)
        .addService(GreetService())
        .addService(CalculatorService())
        .useTransportSecurity(
            File("ssl/server.crt"),
            File("ssl/server.pem")
        )
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