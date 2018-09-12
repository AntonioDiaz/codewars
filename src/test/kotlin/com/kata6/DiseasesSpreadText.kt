package com.kata6

import org.junit.Assert.*
import org.junit.Test
import java.text.DecimalFormat

class epidemyMainTest {

    @Test
    fun testCeil() {
        assertEquals(33, Math.ceil(32.00001).toInt())
    }


    @Test
    fun testInit() {
        println("Fixed Tests: Epidemic")
        var tm = 14
        var n = 336
        var s0 = 999
        var i0 = 2
        var b = 0.00206
        var a = 0.41
        val infectedList = epidemicAllInfected(tm, n, s0, i0, b, a)
        assertEquals(336, infectedList.size)
    }


    @Test
    fun test0() {
        println("Fixed Tests: Epidemic")
        var tm = 14
        var n = 336
        var s0 = 996
        var i0 = 2
        var b = 0.00206
        var a = 0.41
        testing(483, epidemic(tm, n, s0, i0, b, a))
    }

    @Test
    fun test1() {
        println("Fixed Tests: Epidemic")
        var tm = 18
        var n = 432
        var s0 = 1004
        var i0 = 1
        var b = 0.00209
        var a = 0.51
        testing(420, epidemic(tm, n, s0, i0, b, a))
    }

    @Test
    fun test2() {
        println("Fixed Tests: Epidemic")
        val tm = 12
        val n = 288
        val s0 = 1007
        val i0 = 2
        val b = 0.00206
        val a = 0.45
        testing(461, epidemic(tm, n, s0, i0, b, a))
    }

    companion object {
        private fun testing(actual:Int, expected:Int) {
            val r = Math.abs(actual - expected)
            val inrange = r <= 1
            if (!inrange) {
                val df = DecimalFormat("#.0")
                println("abs(actual - expected) must be <= 1 but was " + df.format(r))
            }
            assertEquals(true, inrange)
        }
    }
}