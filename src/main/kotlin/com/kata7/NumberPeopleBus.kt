package com.kata6

//https://www.codewars.com/kata/number-of-people-in-the-bus

fun people(busStops: Array<Pair<Int, Int>>) : Int {
    var people = 0
    busStops.forEach { people +=  it.first - it.second }
    return people
}


