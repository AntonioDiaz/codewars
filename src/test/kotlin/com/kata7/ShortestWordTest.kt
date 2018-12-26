package com.kata6

import org.junit.Assert.assertEquals
import org.junit.Test

class ShortestWordTest {

    @Test
    fun testSplit() {
        val split = "bitcoin take over the world maybe who knows perhaps".split(" ")
        assertEquals(9, split.size)
        val map = split.map { it.length }
        assertEquals(9, map.size)
        assertEquals(7, map[0])
        assertEquals(3, map.min())
    }


    @Test
    fun testFixed() {
        assertEquals(3, findShort("bitcoin take over the world maybe who knows perhaps"))
        assertEquals(3, findShort("turns out random test cases are easier than writing out basic ones"))
    }
}