package com.kata6

import org.junit.Test

import org.junit.Assert.*


class BouncingBallTest {

    @Test
    fun testInvalidInput01() {
        assertEquals(-1, bouncingBall(-0.2, 0.66, 1.5))
    }

    @Test
    fun testInvalidInput02() {
        assertEquals(-1, bouncingBall(2.0, 0.0, 1.5))
    }

    @Test
    fun testInvalidInput03() {
        assertEquals(-1, bouncingBall(2.0, 1.66, 1.5))
    }

    @Test
    fun testInvalidInput04() {
        assertEquals(-1, bouncingBall(2.0, 1.66, 4.5))
    }

    @Test
    fun test1() {
        assertEquals(3, bouncingBall(3.0, 0.66, 1.5))
    }

    @Test
    fun test2() {
        assertEquals(15, bouncingBall(30.0, 0.66, 1.5))
    }

}