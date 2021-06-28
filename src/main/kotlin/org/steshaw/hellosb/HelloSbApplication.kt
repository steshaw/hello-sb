package org.steshaw.hellosb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloSbApplication

fun main(args: Array<String>) {
	runApplication<HelloSbApplication>(*args)
}
