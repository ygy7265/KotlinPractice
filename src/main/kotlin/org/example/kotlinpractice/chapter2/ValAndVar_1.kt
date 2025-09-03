package org.example.kotlinpractice.chapter2

import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component

@Component
class valAndVar_1 {
    @PostConstruct
    fun main() {
        println("Hello World")
        getMax(3, 4) // 4 * false
        getMax(4, 3) // 4 * true
        maxKotlin(1,2) // 2 * false

        // 변수 선언
        val name: String = "Kotlin"
        val age: Int = 28
        // 타입 추론을 이용한 변수 선언
        val nameA = "KotlinA"
        val ageA = 18
        val height = 180.1

        // 변수를 선언하면서 즉시 초기화 하지 않고 나중에 값을 대입할땐 컴파일러가 추론 못함.
        // 이럴경우 명시적으로 타입선언 필요.
        val id : String
        id = "Kotlin World"

        /**
         * val 은 읽기 전용 참조 한번 초기화 하면 다른 값을 대입못함 * java final
         * var 은 재대입 가능한 참조 * java 일반 변수
         * 기본적으로 코틀린에서 부수 효과를 막기 위해 val를 사용하는게 좋다.
         * */
        // result를 읽기 전용 참조로 지정가능
        val result: String

        if (open()) {
            result = "Welcome from Kotlin"
        }else {
            result = "Close from Kotlin"
        }

        // val는 값은 못 바꿔도 내부 값은 바뀔 수 있다.
        val names = mutableListOf("kim")
        names.add("yoon")

        /* 아래와 같이 하면 컴파일러에서 타입추론 못해 에러 발생 */
        // var age = 28
        // result = "yoon"

        val input = readln()
        val score = if(input.isNotBlank()) input else 0
        println("Score is $score")
    }

    // 블록 본문 함수
    fun getMax(a: Int, b: Int): Int {
        return if (a > b) a else b
    }
    // 식 본문 함수
    fun maxKotlin(a: Int, b: Int): Int = if (a > b) a else b
    fun open(): Boolean {
        return true
    }
}