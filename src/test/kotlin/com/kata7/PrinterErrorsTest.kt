package com.kata7

import org.junit.Assert.*
import org.junit.Test

class PrinterErrorsTest {

    @Test
    fun testNoErrors() {
        var input = "aaabbbbhaijjjm"
        assertEquals("0/14", printerError(input))
    }

    @Test
    fun testErrors() {
        var input = "aaaxbbbbyyhwawiwjjjwwm"
        assertEquals("8/22", printerError(input))
    }

    @Test
    fun testFilter() {
        var input = "aabxa"
        val chars = input.toCharArray()
        val aAscii = 'a'.toInt()
        val mAscii = 'm'.toInt()
        assertEquals(5, chars.size)
        chars.map { println(it.toByte()) }
        assertEquals(4, chars.filter { it.toInt() in aAscii..mAscii }.size)
    }

}