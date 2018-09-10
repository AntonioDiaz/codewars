package com.kata7

import org.junit.Assert.*
import org.junit.Test

class rotationsMainTest {
    private fun testing(actual:Boolean, expected:Boolean) {
        assertEquals(expected, actual)
    }

    @Test
    fun testGenerateRots() {
        var arr = setOf<String>("abc","cab", "bca")
        //assertEquals(2, generateAllRotsList("abc").size)
        assertEquals(arr, generateAllRotsList("abc").toSet())
    }


    @Test
    fun test01() {
        println("Fixed Tests containAllRots")
        var a = arrayListOf("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs")
        testing(containAllRots("bsjq", a), true)
    }

    @Test
    fun test02() {
        println("Fixed Tests containAllRots")
        var a = arrayListOf("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY")
        testing(containAllRots("XjYABhR", a), false)
    }
}
