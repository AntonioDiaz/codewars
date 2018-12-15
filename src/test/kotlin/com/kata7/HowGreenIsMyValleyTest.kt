package com.kata7

import org.junit.Assert.*
import java.util.Arrays
import org.junit.Test

class ValleyTest {
    //.................
    private fun testing(actual:String, expected:String) {
        assertEquals(expected, actual)
    }

    @Test
    fun testList() {
        var a = listOf(17, 17, 4, 15)
        assertEquals(listOf(17,17,15,4), a.sortedDescending())

    }

    @Test
    fun testPrev() {
        var a = intArrayOf(17, 17, 15, 4).sortedDescending()
        val listEven = a.filterIndexed { index, _ -> index.rem(2) == 0 }
        val listOdd = a.filterIndexed { index, _ -> index.rem(2) == 1 }
        assertEquals(listOf(17,15), listEven)
        assertEquals(listOf(17,4), listOdd)
        val listAll = listEven.toMutableList()
        listAll.addAll(listOdd.sorted())
        assertEquals(listOf(17,15,4,17), listAll)

    }

    @Test
    fun test1() {
        println("Fixed Tests makeValley")
        var a = intArrayOf(17, 17, 15, 14, 8, 7, 7, 5, 4, 4, 1)
        var r = intArrayOf(17, 15, 8, 7, 4, 1, 4, 5, 7, 14, 17)
        testing(Arrays.toString(makeValley(a)), Arrays.toString(r))
        a = intArrayOf(20, 7, 6, 2)
        r = intArrayOf(20, 6, 2, 7)
        testing(Arrays.toString(makeValley(a)), Arrays.toString(r))

    }
}