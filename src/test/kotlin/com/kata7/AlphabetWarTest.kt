package com.kata7

import org.junit.Assert.*
import org.junit.Test

class AlphabetWarTest {


    @Test
    fun testCharArray() {
        val inputStr = "wwwwww"
        val toByteArray = inputStr.toCharArray()
        assertEquals(6, toByteArray.size)
        val leftSideList = toByteArray.map {
            when (it) {
                'w' -> 4
                'p' -> 3
                'b' -> 2
                's' -> 1
                else -> 0
            }
        }
        val RightSideList = toByteArray.map {
            when (it) {
                'm' -> 4
                'q' -> 3
                'd' -> 2
                'z' -> 1
                else -> 0
            }
        }
        val sum = leftSideList.sum()
        assertEquals(24, sum)


    }

        @Test
    fun testFixed() {
        assertEquals("Right side wins!", alphabetWar("z"))
        assertEquals("Let's fight again!", alphabetWar("zdqmwpbs"))
        assertEquals("Right side wins!", alphabetWar("zzzzs"))
        assertEquals("Left side wins!", alphabetWar("wwwwww"))
    }

}
