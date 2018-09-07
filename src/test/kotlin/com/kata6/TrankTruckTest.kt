package com.kata6


import org.junit.Assert.*
import org.junit.Test

class VolTankTest {


    @Test
    fun powTest() {
        assertEquals(9.0, Math.pow(3.0, 2.0), 0.1)
    }

    @Test
    fun calculateCylinderLengthTest() {
        val cylinderLength = calculateCylinderLength(3500, 60.0)
        println("cylinderLength -->" + cylinderLength)
        assertEquals(0.3095, cylinderLength, 0.001)
    }


    @Test
    fun test0() {
        println("Fixed Tests")
        assertEquals(2940, tankVol(5, 7, 3848))
    }

    @Test
    fun test1() {
        println("Fixed Tests")
        assertEquals(245, tankVol(1, 4, 1256))
    }

    @Test
    fun test2() {
        println("Fixed Tests")
        assertEquals(1750, tankVol(60,120,3500))
    }

    @Test
    fun test3() {
        println("Fixed Tests")
        assertEquals(2478, tankVol(80,120,3500))
    }

    @Test
    fun test4() {
        println("Fixed Tests")
        assertEquals(1021, tankVol(40,120,3500))
    }

    @Test
    fun test5() {
        println("Fixed Tests")
        assertEquals(4202, tankVol(5,11,9503))
    }

}