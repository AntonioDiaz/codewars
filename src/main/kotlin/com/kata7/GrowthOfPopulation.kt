package com.kata7

//https://www.codewars.com/kata/growth-of-a-population/

fun nbYear(pp0:Int, percent:Double, aug:Int, p:Int):Int {
    var population = pp0
    var years = 0
    while(population<p) {
        population += (population*percent/100).toInt() + aug
        years++
    }
    return years
}