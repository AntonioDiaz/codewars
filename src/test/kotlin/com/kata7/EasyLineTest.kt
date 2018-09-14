package com.kata7

import org.junit.Assert.*
import java.math.BigInteger
import org.junit.Test

class EasylineTest {
    private fun testing(actual:BigInteger, expected:BigInteger) {
        assertEquals(expected, actual)
    }

    @Test
    fun testSequenceEasy() {
        val rowNum = 4
        val elementsInRow = rowNum + 1
        var mySequence = generateSequence(0) { it + 1 }.take( elementsInRow).map { calculateRecursion(rowNum, it) }
        assertEquals(elementsInRow, mySequence.toList().size)
        assertEquals(listOf(1,4,6,4,1), mySequence.toList())
    }

    @Test
    fun testSequence() {
        var mySequence = generateSequence(0) { it + 1  }.take(7).filter { it==5 }.map { it*2 }
        assertEquals(1, mySequence.toList().size)
        assertEquals(10, mySequence.first())
    }

    @Test
    fun testSequence2() {
        val n = 7
        var mySequence = generateSequence(0) { it }.take(n).mapIndexed {index, it ->
            if (index==0 || index==n-1) 1 else it
        }

        assertEquals(1, mySequence.first())
        assertEquals(1, mySequence.last())
        assertEquals(n, mySequence.toList().size)

    }


    @Test
    fun testCalculateRecursion(){
        assertEquals(1, calculateRecursion(0, 0))
    }


    @Test
    fun testCalculateRecursion2(){
        assertEquals(2, calculateRecursion(2, 1))
    }


    @Test
    fun testCalculateRecursion7(){
        assertEquals(1, calculateRecursion(7, 7))
    }

    @Test
    fun testCalculateRecursion5(){
        assertEquals(10, calculateRecursion(5, 2))
    }

    @Test
    fun testGenerateRow() {
        val row = generateRow(3)
        assertEquals(4, row.size)
        assertEquals(listOf(1,3,3,1), row)
    }


    @Test
    fun generateRowTest() {
        val rowNum = 4
        val myRow = generateRow(rowNum)
        assertEquals(5, myRow.size)
        assertEquals(listOf(1,4,6,4,1), myRow)
    }

    @Test
    fun generateRowsTest() {
        val rowNum = 4
        val rows = generateRows(rowNum)
        assertEquals(5, rows.size)

    }

    @Test
    fun testSmall() {
        testing(easyLine(4), BigInteger("70"))
    }
    @Test
    fun test1() {
        testing(easyLine(7), BigInteger("3432"))
    }
    @Test
    fun test2() {
        testing(easyLine(13), BigInteger("10400600"))
    }
    @Test
    fun test50() {
        testing(easyLine(50), BigInteger("100891344545564193334812497256"))
    }
}