package com.kata6

import org.junit.Assert.assertEquals
import org.junit.Test

class NumberPeopleBusTest {


    @Test
    fun `Test array`() {
        val arrayOf = arrayOf(3 to 0, 9 to 1, 4 to 10, 12 to 2, 6 to 1, 7 to 10)
        assertEquals(6, arrayOf.size)
        assertEquals(3, arrayOf[0].first)
        var people = 0
        arrayOf.forEach { people +=  it.first - it.second }
        assertEquals(17, people)
    }

    @Test
    fun `Basic Tests`() {
        assertEquals(17, people(arrayOf(3 to 0,9 to 1,4 to 10,12 to 2,6 to 1,7 to 10)))
        assertEquals(21, people(arrayOf(3 to 0,9 to 1,4 to 8,12 to 2,6 to 1,7 to 8)))
        assertEquals(5, people(arrayOf(10 to 0,3 to 5,5 to 8)))
    }
}