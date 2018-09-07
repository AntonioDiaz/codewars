package com.kata7

import org.junit.Test

import org.junit.Assert.*

class PasswordHiderTest {
    @Test
    fun hidePasswordFromConnection() {
        assertEquals("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=*****",
                PasswordHider.hidePasswordFromConnection("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345"))
    }
    @Test
    fun hidePasswordFromConnectionUserFirst() {
        assertEquals("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?password=*****&user=root",
                PasswordHider.hidePasswordFromConnection("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?password=*****&user=root"))
    }
}