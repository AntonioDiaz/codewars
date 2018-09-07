package com.kata6

import org.junit.Assert.*

import org.junit.Assert.*
import org.junit.Test

class MaxDiffLengthTest {
    @Test
    fun test() {
        println("mxdiflg Fixed Tests")
        var s1 = arrayOf<String>("hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz")
        var s2 = arrayOf<String>("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww")
        assertEquals(13,mxdiflg(s1, s2))
        s1 = arrayOf<String>("ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh")
        s2 = arrayOf<String>("bbbaaayddqbbrrrv")
        assertEquals(10,mxdiflg(s1, s2))

    }
}