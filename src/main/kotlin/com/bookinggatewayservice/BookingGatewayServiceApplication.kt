package com.bookinggatewayservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import reactor.core.publisher.Hooks

@EnableDiscoveryClient
@SpringBootApplication
class BookingGatewayServiceApplication

fun main(args: Array<String>) {
    Hooks.enableAutomaticContextPropagation()
    runApplication<BookingGatewayServiceApplication>(*args)
}
