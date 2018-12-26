package com.kata6

import org.junit.Assert.assertEquals
import org.junit.Test

class RotateMaxTest {


    @Test
    fun rotateTest() {
        assertEquals("84582153", "38458215".rotate(1))
        assertEquals("45821538", "38458215".rotate(2))
    }

    @Test
    fun generateRotationsTest() {
        var s = "507992495"
        var list = mutableListOf<Long>()
        list.add(s.toLong())
        for (i in 0..(s.length -1)) {
            println("$i : s -> $s")
            s = s.substring(0, i) + s.substring(i).rotate(1)
            list.add(s.toLong())
        }
        assertEquals(507992495, list.max())
        99249557
        //assertEquals(507992495, list.max()?.toLong())
    }

        @Test
    fun test() {
        println("Fixed Tests maxRot")
        assertEquals(maxRot(38458215), 85821534)
        assertEquals(maxRot(195881031), 988103115)
        assertEquals(maxRot(896219342), 962193428)
    }
}