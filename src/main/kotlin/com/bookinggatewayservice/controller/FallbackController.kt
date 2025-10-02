package com.bookinggatewayservice.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class FallbackController {

    @GetMapping("/fallback")
    fun fallback() =
        Mono.just(
            ResponseEntity.status(503)
                .body("{\"error\": \"Сервис временно недоступен\"}")
        )

}