package com.example

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable



@Serializable
data class CalculationRequest(var operand1: Int, var operand2: Int)

@Serializable
data class CalculationResponse(val result: Int)

fun main() {
    val server = embeddedServer(Netty, port = 8083) {
        install(ContentNegotiation) {
            json()
        }
        routing {
            post("/api/calculator/add") {
                val request = call.receive<CalculationRequest>()
                val result = request.operand1 + request.operand2
                call.respond(CalculationResponse(result))
            }
        }
    }
    server.start(wait = true)
}
