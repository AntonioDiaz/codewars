package com.kata7

//https://www.codewars.com/kata/simple-beads-count
fun countRedBeads(nBlue: Int): Int {
    return if (nBlue<2) 0 else (nBlue-1)*2
}