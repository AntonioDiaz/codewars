package com.kata7

//https://www.codewars.com/kata/hide-password-from-jdbc-url/kotlin
object PasswordHider {
    fun hidePasswordFromConnection(urlString: String): String {
        return "password=.[^&]*".toRegex().replace(urlString) {
            m -> "password=" + "*".repeat(m.value.length - 9)
        }
    }
}