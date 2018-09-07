package com.kata7


import org.junit.Assert.*
import org.junit.Test

class CountDigTest {
    private fun testing(actual:Int, expected:Int) {
        assertEquals(expected.toLong(), actual.toLong())
    }

    @Test
    fun testCharConversions() {
        assertEquals('0', 0.toString()[0])
    }

    @Test
    fun testShort() {
        println("Fixed Tests nbDig")
        testing(nbDig(10, 1), 4)

    }
    @Test
    fun test() {
        println("Fixed Tests nbDig")
        testing(nbDig(5750, 0), 4700)
        testing(nbDig(11011, 2), 9481)

    }
}