package com.techorgx.api.controllers

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = ["http://localhost:5173"])
class IdentityController {

    @GetMapping("/test")
    fun test(): String {
        return "Testing the API"
    }
}
