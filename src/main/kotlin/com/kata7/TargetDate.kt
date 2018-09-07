package com.kata7

import java.time.LocalDate
import java.time.format.DateTimeFormatter

//https://www.codewars.com/kata/target-date/train/kotlin

fun dateNbDays (a0:Double, a:Double, p:Double):String {
    var amount = a0
    var days:Long = 0
    while(amount<a) {
        amount += amount * p/36000
        days++
    }
    val pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    val date = LocalDate.parse("2016-01-01", pattern)
    return pattern.format(date.plusDays(days))
}