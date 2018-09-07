package com.kata7

import org.junit.Assert.assertEquals
import org.junit.Test
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class DateDaysTest {

    @Test
    fun calculateDaysTest() {
        var initAmount = 100.0
        var targetAmount = 101.0
        var interest = 0.98
        var days = 0;
        while(initAmount<targetAmount) {
            initAmount += initAmount * interest/36000
            days++
        }
        assertEquals(101.0, initAmount, 0.1)
        assertEquals(366, days)
    }

    @Test
    fun formatDates() {
        val pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd")
        val date = LocalDate.parse("2016-01-01", pattern)
        assertEquals(date.year, 2016)
        assertEquals(date.monthValue, 1)
        val plusDays = date.plusDays(366)
        assertEquals("2017-01-01", pattern.format(plusDays))
    }

    @Test
    fun testShort01() {
        println("Fixed Tests short 01")
        assertEquals("2017-01-01", dateNbDays(100.0, 101.0, 0.98))
    }

    @Test
    fun testShort02() {
        println("Fixed Tests short 02")
        assertEquals("2035-12-26", dateNbDays(100.0, 150.0, 2.0))
    }


    @Test
    fun test01() {
        println("Fixed Tests dateNbDays 01")
        assertEquals("2024-07-03", dateNbDays(4281.0, 5087.0, 2.0))
    }
    @Test
    fun test02() {
        println("Fixed Tests dateNbDays 02")
        assertEquals("2021-09-19", dateNbDays(4620.0, 5188.0, 2.0))
    }
}