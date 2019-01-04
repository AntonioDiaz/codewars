package com.kata7

//https://www.codewars.com/kata/alphabet-war

fun alphabetWar(fight: String): String {
    val leftSideList = fight.toCharArray().map {
        when (it) {
            'w' -> 4
            'p' -> 3
            'b' -> 2
            's' -> 1
            else -> 0
        }
    }
    val rightSideList = fight.toCharArray().map {
        when (it) {
            'm' -> 4
            'q' -> 3
            'd' -> 2
            'z' -> 1
            else -> 0
        }
    }
    val fight = leftSideList.sum().compareTo(rightSideList.sum())
    return when  {
        fight > 0 -> "Left side wins!"
        fight < 0 -> "Right side wins!"
        else -> "Let's fight again!"
    }
}