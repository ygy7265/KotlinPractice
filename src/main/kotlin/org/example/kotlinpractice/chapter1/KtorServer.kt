package org.example.kotlinpractice.chapter1

import io.ktor.server.application.call
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.server.response.respond
import io.ktor.server.routing.get
import io.ktor.server.routing.post
import io.ktor.server.routing.route
import io.ktor.server.routing.routing
import jakarta.annotation.PostConstruct
import org.springframework.http.RequestEntity.post
import org.springframework.stereotype.Component

@Component
class KtorServer {
//    @PostConstruct
    fun ktorServer() {
        embeddedServer(Netty, 9090) {
            routing {
                get("/hello"){
                    call.respond("Hello Yoon")
                }
                route("/bye"){
                    get{call.respond("Bye Any")}
                    post("{name}") {
                        val name = call.parameters["name"] ?: "Anonymous"
                        call.respond("Bye, ${name}")
                    }
                }
            }
        }.start(wait = true) // true 동기 false 비동기
    }
}