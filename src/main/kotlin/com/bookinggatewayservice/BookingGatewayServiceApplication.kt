package com.bookinggatewayservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class BookingGatewayServiceApplication

fun main(args: Array<String>) {
    runApplication<BookingGatewayServiceApplication>(*args)
}
