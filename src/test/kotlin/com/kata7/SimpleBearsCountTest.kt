package com.kata7

import org.junit.Test
import java.util.Random
import org.junit.Assert.assertEquals


class TestReplace {

    @Test
    fun testFixed01() {
        assertEquals(0, countRedBeads(0));
    }

    @Test
    fun testFixed02() {
        assertEquals(0, countRedBeads(1));
    }

    @Test
    fun testFixed03() {
        assertEquals(4, countRedBeads(3));
    }

    @Test
    fun testFixed04() {
        assertEquals(8, countRedBeads(5));
    }

}