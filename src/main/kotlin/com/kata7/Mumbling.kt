package com.kata7

//https://www.codewars.com/kata/mumbling

fun accum(s:String):String {
    return s
            .toCharArray()
            .mapIndexed {index,element -> MutableList(index+1){element}.joinToString("").toLowerCase().capitalize() }
            .joinToString("-")
}