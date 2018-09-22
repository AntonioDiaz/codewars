package com.kata7

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class Tests {

    @Test
    fun modTest(){
        assertThat(1, `is`(9%8))
        assertThat(-1, `is`(-9%8))
    }

    @Test(expected = Exception::class)
    fun circularListTestException() {
        CircularList<String>()
    }

    @Test
    fun circularListTest01() {
        val xs = CircularList<String>("one", "two", "three")
        assertThat(xs.next(), `is`("one"))
        assertThat(xs.next(), `is`("two"))
        assertThat(xs.next(), `is`("three"))
        assertThat(xs.next(), `is`("one"))
        assertThat(xs.prev(), `is`("three"))
        assertThat(xs.prev(), `is`("two"))
        assertThat(xs.prev(), `is`("one"))
        assertThat(xs.prev(), `is`("three"))
    }
    @Test
    fun circularListTest02() {
        val ys = CircularList<Int>(1, 2, 3, 4, 5)
        assertThat(ys.prev(), `is`(5))
        assertThat(ys.prev(), `is`(4))
        assertThat(ys.next(), `is`(5))
        assertThat(ys.next(), `is`(1))
        assertThat(ys.next(), `is`(2))
        assertThat(ys.next(), `is`(3))
        assertThat(ys.next(), `is`(4))
        assertThat(ys.prev(), `is`(3))
        assertThat(ys.prev(), `is`(2))
        assertThat(ys.next(), `is`(3))
        assertThat(ys.next(), `is`(4))
        assertThat(ys.next(), `is`(5))
        assertThat(ys.next(), `is`(1))
        assertThat(ys.next(), `is`(2))
        assertThat(ys.next(), `is`(3))
    }
}