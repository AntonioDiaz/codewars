package com.kata7

import java.math.BigInteger;

//https://www.codewars.com/kata/easy-line/




fun calculateRecursion(row:Int, index: Int):Int {
    if (index==0 || row==index) {
        return 1
    } else {
        return calculateRecursion(row-1, index-1) + calculateRecursion(row-1, index)
    }
}

fun generateRow(rowIndex: Int): List<Int> {
    return generateSequence(0){it+1}.take(rowIndex + 1).map { calculateRecursion(rowIndex, it) }.toList()
}

fun generateRows(rowNum: Int): List<List<BigInteger>> {
    val list = mutableListOf<List<BigInteger>>()
    list.add(listOf(BigInteger("1")))
    for (i in 1..rowNum) {
        var subList = mutableListOf<BigInteger>()
        for (j in 0 .. i) {
            if(j==0 || j==i) {
                subList.add(BigInteger("1"))
            } else {
                subList.add(list.get(i-1).get(j-1).add(list.get(i-1).get(j)))
            }
        }
        list.add(subList)
    }
    return list
}

fun easyLine(n:Int):BigInteger {
    var mySum:BigInteger = BigInteger.ZERO
    val rows = generateRows(n)
    rows[n].forEach{mySum = mySum.add(it.pow(2)) }
    return mySum
}

fun easyLineOld(n:Int):BigInteger {
    var mySum:BigInteger = BigInteger.ZERO
    generateRow(n).forEach {mySum = mySum.add(BigInteger.valueOf(it.toLong() * it.toLong())) }
    return mySum
}