package com.example

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.netty.EngineMain
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json


@Serializable
data class CalculationRequest(var operand1: Int, var operand2: Int)

@Serializable
data class CalculationResponse(val result: Int)

fun main(args: Array<String>): Unit = EngineMain.main(args)

fun Application.module() {
    install(ContentNegotiation) {
        json(Json {
            prettyPrint = true
            isLenient = true
        })
    }

    routing {
        post("/api/calculator/add") {
            val request = call.receive<CalculationRequest>()
            val result = request.operand1 + request.operand2
            call.respond(CalculationResponse(result))
        }
    }
}