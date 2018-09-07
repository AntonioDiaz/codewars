package com.kata7

//https://www.codewars.com/kata/56f3a1e899b386da78000732/train/kotlin
fun partlist(arr:Array<String>): Array<Array<String>?> {
    val result: MutableList<Array<String>> = mutableListOf()
    for(i in 0..(arr.size -2)) {
        var sFirst = arr.sliceArray(0..i).joinToString(" ")
        var sLast = arr.sliceArray((i+1) .. (arr.size-1)).joinToString(" ")
        result.add(arrayOf(sFirst, sLast))
    }
    return result.toTypedArray()
}