package org.example

import io.ktor.application.*
import io.ktor.client.features.BodyProgress.Feature.install
import io.ktor.features.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration

@Serializable
data class CalculationRequest(val operand1: Double, val operand2: Double)

@Serializable
data class CalculationResponse(val result: Double)

fun main() {
    val server = embeddedServer(Netty, port = 8081) {
        install(ContentNegotiation) {
            json(Json(JsonConfiguration.Stable))
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

