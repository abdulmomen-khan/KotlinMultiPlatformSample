package com.example.alib

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class Greeting {
    private val platform: Platform = Platform()
    private val client = HttpClient()


//    fun greeting(): String {
//        return "Hello, ${platform.name}!"
//    }

    suspend fun greetingAPI(): String {
        val response = client.get("https://ktor.io/docs/")
        return response.bodyAsText()
    }
}