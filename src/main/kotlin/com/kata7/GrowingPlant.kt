package com.kata7

//https://www.codewars.com/kata/simple-fun-number-74-growing-plant/train/kotlin

fun growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int {
    var currentHeight = 0
    var cont = 0
    while (currentHeight<desiredHeight) {
        cont++
        currentHeight+=upSpeed
        if (currentHeight>=desiredHeight)
            return cont
        currentHeight-=downSpeed
    }
    return cont
}