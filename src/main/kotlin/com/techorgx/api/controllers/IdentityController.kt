package com.techorgx.api.controllers

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = ["http://localhost:5173"])
class IdentityController {

    @PostMapping("/login")
    fun getLoginCredentials(@RequestBody request: String): String {
        return "Login credentials: $request"
    }
}
