package com.example

import io.ktor.http.*
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
data class CalculationResponse(val result: Double)

fun main() {
    val server = embeddedServer(Netty, port = 8082) {
        install(ContentNegotiation) {
            json()
        }
        routing {
            post("/api/calculator/divide") {
                try {
                    val request = call.receive<CalculationRequest>()
                    if (request.operand2 == 0) {
                        call.respond(HttpStatusCode.BadRequest, "Division by zero is not allowed")
                    } else {
                        val result = (request.operand1.toDouble() / request.operand2.toDouble())
                        call.respond(CalculationResponse(result))
                    }
                } catch (e: Exception) {
                    call.respond(HttpStatusCode.BadRequest, "Invalid request: ${e.message}")
                }
            }
        }
    }
    server.start(wait = true)
}