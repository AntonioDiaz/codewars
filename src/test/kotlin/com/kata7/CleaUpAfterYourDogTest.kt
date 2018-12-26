package com.kata6

import org.junit.Assert.assertEquals
import org.junit.Test

class CleaUpAfterYourDogTest {

    @Test
    fun testFixed() {
        assertEquals("Clean", crap(arrayOf(charArrayOf('_','_','_','_'), charArrayOf('_','_','_','@'), charArrayOf('_','_','@', '_')), 2, 2))
        assertEquals("Cr@p", crap(arrayOf(charArrayOf('_','_','_','_'), charArrayOf('_','_','_','@'), charArrayOf('_','_','@', '_')), 1, 1))
        assertEquals("Dog!!", crap(arrayOf(charArrayOf('_','_'), charArrayOf('_','@'), charArrayOf('D','_')), 2, 2))
    }

}