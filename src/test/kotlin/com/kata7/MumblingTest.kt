package com.kata7

import com.sun.deploy.util.StringUtils
import org.junit.Assert.*
import org.junit.Test

class AccumulTest {

    private fun testing(actual:String, expected:String) {
        assertEquals(expected, actual)
    }


    @Test
    fun testList() {
        val list = MutableList(3) {'a'}
        assertEquals("aaa", list.joinToString(""))
    }

    @Test
    fun testPrev() {
        assertEquals(3, "Zpg".toCharArray().size)
        val joinToString = "Zpg".toCharArray().mapIndexed {index,element -> MutableList(index+1){element}.joinToString("").capitalize() }.joinToString("-")
        assertEquals("Z-Pp-Ggg", joinToString)
    }

        @Test
    fun test01() {
        println("Fixed Tests accum")
        testing(accum("ZpglnRxqenU"), "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu")
    }

    @Test
    fun test02() {
        println("Fixed Tests accum")
        testing(accum("NyffsGeyylB"), "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb")
    }
}