package com.kata7

//https://www.codewars.com/kata/printer-errors/train/kotlin


fun printerError(inputColors:String):String {
    val aAscii = 'a'.toInt()
    val mAscii = 'm'.toInt()
    val colorsWrongSize = inputColors.length - inputColors.toCharArray().filter { it.toInt() in aAscii..mAscii }.size
    return "$colorsWrongSize/${inputColors.length}"
}