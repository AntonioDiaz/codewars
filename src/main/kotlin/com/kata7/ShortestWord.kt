package com.kata6

//https://www.codewars.com/kata/shortest-word/train/kotlin

fun findShort(s: String): Int {
    return s.split(" ").map { it.length }.min()!!
}
