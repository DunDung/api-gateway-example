package com.dundung.piapigateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PiApiGatewayApplication

fun main(args: Array<String>) {
    runApplication<PiApiGatewayApplication>(*args)
}
