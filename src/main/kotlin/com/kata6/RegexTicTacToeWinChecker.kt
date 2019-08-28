package com.kata6

//https://www.codewars.com/kata/regex-tic-tac-toe-win-checker/

fun winChecker(board : String) : Boolean {
    val boardNoX = board.replace("X", "8")
    val boardNoO = board.replace("O", "8")
    val horizontal = Regex(pattern = """888.{6}|.{3}888.{3}|.{6}888""")
    val diagonal = Regex(pattern = """8.{3}8.{3}8|.{2}8.{1}8.{1}8.{2}""")
    val vertical = Regex(pattern = """8.{2}8.{2}8.{2}|.8..8..8.|..8..8..8""")
    return horizontal.containsMatchIn(boardNoX) || diagonal.containsMatchIn(boardNoX) || vertical.containsMatchIn(boardNoX)
            || horizontal.containsMatchIn(boardNoO) || diagonal.containsMatchIn(boardNoO) || vertical.containsMatchIn(boardNoO)
}
