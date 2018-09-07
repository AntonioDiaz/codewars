package com.kata7

//https://www.codewars.com/kata/count-the-digit/train/kotlin

fun nbDig(n:Int, d:Int):Int {
    val myChar = (d+48).toChar();
    var count = 0;
    repeat(n + 1) {
        count += (it*it).toString().filter { it== myChar}.length
    }
    return count
}