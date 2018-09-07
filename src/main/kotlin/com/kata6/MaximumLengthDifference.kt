package com.kata6


fun getMaxMinStringSize(a:Array<String>):Pair<Int, Int> {
    var min = Integer.MAX_VALUE
    var max = Integer.MIN_VALUE
    a.forEach { it: String ->
        if (it.length < min) min = it.length
        if (it.length > max) max = it.length
    }
    return Pair(min, max);
}

fun mxdiflg(a1:Array<String>, a2:Array<String>):Int {
    if (a1.isEmpty() || a2.isEmpty()) {
        return -1
    }
    val pairA1 = getMaxMinStringSize(a1)
    val pairA2 = getMaxMinStringSize(a2)
    return maxOf(pairA1.second - pairA2.first, pairA2.second - pairA1.first);
}