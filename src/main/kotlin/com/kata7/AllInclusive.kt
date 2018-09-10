package com.kata7

//https://www.codewars.com/kata/all-inclusive/

fun generateAllRotsList(strng: String): List<String> {
    val arr: MutableList<String> = mutableListOf()
    (1 .. strng.length).mapTo(arr) {
        strng.substring(it, strng.length) + strng.substring(0, it)
    }
    return arr
}


fun containAllRots(strng:String, arr:ArrayList<String>):Boolean {
    for (i in 0 .. strng.length) {
        if (!arr.contains(strng.substring(i, strng.length) + strng.substring(0, i))) {
            return false;
        }
    }
    return true;
}