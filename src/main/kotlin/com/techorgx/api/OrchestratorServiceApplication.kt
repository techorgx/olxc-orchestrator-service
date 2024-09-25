package com.techorgx.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
open class OrchestratorServiceApplication

fun main(args: Array<String>) {
    @Suppress("SpreadOperator")
    runApplication<OrchestratorServiceApplication>(*args)
}
