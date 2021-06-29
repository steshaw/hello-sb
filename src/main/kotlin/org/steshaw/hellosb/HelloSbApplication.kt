package org.steshaw.hellosb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class HelloSbApplication

fun main(args: Array<String>) {
    runApplication<HelloSbApplication>(*args)
}

@RestController
class MyController {
    @GetMapping("/")
    fun root(): String {
        return "ok\n"
    }
}
