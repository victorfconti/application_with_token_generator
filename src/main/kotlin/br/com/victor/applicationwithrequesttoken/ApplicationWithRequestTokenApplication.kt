package br.com.victor.applicationwithrequesttoken

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApplicationWithRequestTokenApplication

fun main(args: Array<String>) {
	runApplication<ApplicationWithRequestTokenApplication>(*args)
}
