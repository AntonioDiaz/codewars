package com.kata7

import org.junit.Assert.assertEquals
import org.junit.Test

class GrowingPlantTest {
    @Test
    fun testFixed() {
        assertEquals(10, growingPlant(100,10,910))
        assertEquals(1, growingPlant(10,9,4))
    }
}