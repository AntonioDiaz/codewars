package com.kata6



//https://www.codewars.com/kata/disease-spread

fun epidemicAllInfected(tm:Int, n:Int, s0:Int, i0:Int, b:Double, a:Double):List<Int> {
    /*
    (I)    S[k+1] = S[k] - dt * b * S[k] * I[k]
    (II)   I[k+1] = I[k] + dt * (b * S[k] * I[k] - a * I[k])
    (III)  R[k+1] = R[k] + dt * I[k] *a
    */
    var dt = tm.toDouble()/n.toDouble()
    var infectedList = mutableListOf<Int>()
    var prevS = s0.toDouble();
    var prevI = i0.toDouble();
    var prevR = 0.toDouble();
    repeat(n){

        val s = prevS - dt * b * prevS * prevI
        val i = prevI + dt * (b * prevS * prevI - a * prevI)
        val r = prevR + dt * prevI * a
        println("$dt")
        println("$it s $s ")
        println("$n i $i ")
        println("$n r $r ")
        infectedList.add(Math.ceil(i).toInt())
        prevS = s
        prevI = i
        prevR = r
    }
    return infectedList
}

fun epidemic(tm:Int, n:Int, s0:Int, i0:Int, b:Double, a:Double):Int {
    return epidemicAllInfected(tm, n, s0, i0, b, a).max()!!
}