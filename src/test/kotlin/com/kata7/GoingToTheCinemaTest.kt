package com.kata7

import org.junit.Assert.*
import org.junit.Test

class MovieTest {

    @Test
    fun test1() {
        println("Fixed Tests: movie")
        assertEquals(43, movie(500, 15, 0.9))
    }

    @Test
    fun test2() {
        println("Fixed Tests: movie")
        assertEquals(24, movie(100, 10, 0.95))
    }
}