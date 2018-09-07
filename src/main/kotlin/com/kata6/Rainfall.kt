package com.kata6

//https://www.codewars.com/kata/56a32dd6e4f4748cc3000006/train/kotlin

fun cityTemperatures(town:String, strng: String): List<Double> {
    val filter = strng.split("\n").filter { it.startsWith(town + ":") }
    if (filter.isNotEmpty()) {
        var temperaturesStr = filter[0].replace(town + ":", "")
        return temperaturesStr.split(",").map { it.split(" ")[1].toDouble() }
    } else {
        return emptyList()
    }
}

fun mean(town:String, strng:String):Double {
    var myMean = -1.0
    val cityTemperatures = cityTemperatures(town, strng)
    if (cityTemperatures.isNotEmpty()) {
        myMean = cityTemperatures.sum() / 12
    }
    return myMean;
}

fun variance(town:String, strng:String):Double {
    val cityTemperatures = cityTemperatures(town, strng)
    if (cityTemperatures.isNotEmpty()) {
        val mean = mean(town, strng)
        return cityTemperatures.map { Math.pow(Math.abs(it - mean), 2.0) }.sum().div(cityTemperatures.size)
    }
    return -1.0
}