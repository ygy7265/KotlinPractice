package org.example.kotlinpractice.chapter1

import jakarta.annotation.PostConstruct
import lombok.extern.slf4j.Slf4j
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
//@Slf4j
//@Component
class MethodPractice {
    private val log: Logger = LoggerFactory.getLogger(MethodPractice::class.java)
//    @PostConstruct
    fun init() {
        checkUser("test")
        checkUser(1)
    }
    fun checkUser(name: Any){
        if(name is String){
            log.info("Method practice name: {}", name)
        }
    }
}