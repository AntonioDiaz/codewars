package com.kata6

//https://www.codewars.com/kata/clean-up-after-your-dog/train/kotlin

fun crap(x: Array<CharArray>, bags: Int, cap: Int): String {
    var crapCont = 0
    var dog = false
    x.forEach { it.forEach { it ->
        if (it=='@') crapCont++
        if (it=='D') dog = true
    } }
    return if (dog) {
        "Dog!!"
    } else {
        if (bags * cap > crapCont) {
            "Clean"
        } else {
            "Cr@p"
        }
    }
}

