package com.kata6

import junit.framework.Assert.*
import org.junit.Test


class RegexTicTacToeWinCheckerTest {

    @Test
    fun someBoardsWithWinnersTests () {
        val winners = arrayOf("XXX-O-O-O", "X--OOOX-X", "O--OO-XXX", "O-XOX-O-X", "OXOOXOXX-", "X-O-OOXXO", "XO--X-OOX", "X-OXOOOXX")
        winners.forEach { winner ->
            println("Testing with board $winner")
            assertEquals(true, winChecker(winner))
        }
    }

    @Test
    fun someBoardsWithoutWinnersTests () {
        val notWinners = arrayOf("XO-------", "XX-XOO---", "-XX-OO-O-", "OXO--XXO-", "OOXXXO---", "OXXX-XOO-", "OOXXX----", "XXOOXXOO-", "OXOXOX---")
        notWinners.forEach { notWinner ->
            println("Testing with board $notWinner")
            assertEquals(false, winChecker(notWinner))
        }
    }

    @Test
    fun testGroups() {
        val value = """(\w+?)(?<num>\d+)""".toRegex().matchEntire("area51")!!.groups["num"]!!.value
        assertEquals("51", value)
    }

    @Test
    fun testRegex() {
        val regex = """(.+)X(?<rest>[0|-]+)""".toRegex()
        val matchResult = regex.findAll("X--OOOX-X")
        assertNotNull(matchResult)
        matchResult.forEach { f -> println(f!!.groups["rest"]!!.value) }

        //assertTrue(matchResult!!.groups["rest"]!=null)
        //assertEquals("--OOOX-X", matchResult!!.groups["rest"]!!.value)
    }


    fun testRegex2(){
        val horizontal = Regex(pattern = """XXX.{6}|.{3}XXX.{3}|.{6}XXX""")
        val diagonal = Regex(pattern = """X.{3}X.{3}X|.{2}X.{1}X.{1}X.{2}""")
        val vertical = Regex(pattern = """X.{2}X.{2}X.{2}|.X..X..X.|..X..X..X""")

    }
}
