package com.kata7


import com.kata6.backwardsPrime
import com.kata6.isPrime
import org.junit.Assert.assertEquals
import org.junit.Test

class BackWardsPrimeTest {

    @Test
    fun backWardsPrime1() {
        assertEquals("7027 7043 7057", backwardsPrime(7000, 7100))
    }

    @Test
    fun backWardsPrime2() {
        assertEquals("70001 70009 70061 70079 70121 70141 70163 70241", backwardsPrime(70000, 70245))
    }

    @Test
    fun isPrimeTest() {
        assertEquals(false, isPrime(0))
        assertEquals(false, isPrime(1))
        assertEquals(true, isPrime(2))
        assertEquals(true, isPrime(3))
        assertEquals(false, isPrime(4))
        assertEquals(true, isPrime(7027))
        assertEquals(true, isPrime(7207))
        assertEquals(true, isPrime(70207))
        assertEquals(true, isPrime(70207))
    }
}