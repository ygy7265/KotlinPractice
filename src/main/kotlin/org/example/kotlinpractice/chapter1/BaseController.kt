package org.example.kotlinpractice.chapter1

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BaseController {

    @GetMapping("/users")
    fun getList(): List<User> = listOf(
        User("kim", 20),
        User("sim", 25),
        User("yoon", 28),
        User("tom", 29),
    )
}

data class User(var name: String, var age: Int)