package com.kata7

//https://www.codewars.com/kata/how-green-is-my-valley

import java.util.Arrays

fun makeValley(arr:IntArray):IntArray {
    val listEven = arr.filterIndexed { index, _ -> index.rem(2) == 0 }
    val listOdd = arr.filterIndexed { index, _ -> index.rem(2) == 1 }
    val listAll = listEven.toMutableList()
    listAll.addAll(listOdd.sorted())
    return listAll.toIntArray()
}