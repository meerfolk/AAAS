package org.meerfolk.aaas.presentation.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

import org.meerfolk.aaas.infrastructure.user.*

@RestController
@RequestMapping("/user")
class UserController(private val userRepository: UserRepository) {

    @PostMapping()
    fun createUser(@RequestBody user: UserEntity): ResponseEntity<UserEntity> {
        println(user)
        return ResponseEntity(userRepository.save(user), HttpStatus.CREATED)
    }
}