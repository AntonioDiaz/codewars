package com.kata6

//https://www.codewars.com/kata/tank-truck/

import java.lang.Math.pow

fun calculateCylinderLength(volume:Int, radius:Double):Double {
    return volume.div(Math.PI * radius * radius)
}

fun tankVol(hOriginal:Int, d:Int, vt:Int):Int {
    val h:Double = d.toDouble() - hOriginal.toDouble()
    val r:Double = d.toDouble().div(2.0).toDouble();
    val l = calculateCylinderLength(vt, d.toDouble() / 2.0)
    val rPow = pow(r, 2.0)
    val firstOperator = Math.PI * rPow
    val secondOperator = rPow * Math.acos((r-h)/r)
    val thirdOperator = (r - h) * Math.sqrt(2.0 * r * h - pow(h, 2.0))
    return (l * (firstOperator - secondOperator + thirdOperator)).toInt()
}