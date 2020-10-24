package com.handra.demo.demometrics

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/hello/{name}")
    fun sayHello(@PathVariable("name") name: String): String = "Hello $name. Greetings for monitoring."
}