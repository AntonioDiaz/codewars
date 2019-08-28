package com.kata6


fun stringExpansion(s: String): String {
    var newString = ""
    var repetitions = 1
    s.toCharArray().forEach {
        print(it)
        if (it.isDigit()) {
            repetitions = it.toString().toInt()
        } else {
            newString += it.toString().repeat(repetitions)
        }
    }
    return newString
}