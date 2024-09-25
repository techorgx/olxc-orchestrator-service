package com.techorgx.api.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class IdentityController {

    @GetMapping("/test")
    fun test(): String {
        return "Testing the API"
    }
}
