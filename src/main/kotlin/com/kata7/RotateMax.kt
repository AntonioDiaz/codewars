package com.kata6

//https://www.codewars.com/kata/rotate-for-a-max/train/kotlin

fun String.rotate(n: Int) = drop(n % length) + take(n % length)

fun maxRot(n:Long):Long {
    var s = n.toString()
    var list = mutableListOf<Long>()
    list.add(s.toLong())
    for (i in 0..(s.length -1)) {
        s = s.substring(0, i) + s.substring(i).rotate(1)
        list.add(s.toLong())
    }
    return list.max()!!
}


