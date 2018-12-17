package com.kata6

//https://www.codewars.com/kata/backwards-read-primes/train/kotlin

fun backwardsPrime(start:Long, end:Long):String {
    var myPrimes = ""
    for (i in start .. end) {
        val reversedI = i.toString().reversed().toInt()
        if (i.toInt()!=reversedI && isPrime(i.toInt()) && isPrime(reversedI))
            myPrimes += " $i"
    }
    return myPrimes.trim()
}

fun isPrime(n: Int): Boolean {
    if (n<2)
        return false
    for (i in 2 .. n / 2) {
        if (n % i === 0)
            return false
    }
    return true
}