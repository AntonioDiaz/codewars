package com.kata6

//https://www.codewars.com/kata/bouncing-balls/train/kotlin
fun bouncingBall(h:Double, bounce:Double, window:Double):Int {
    if (h<=0 || bounce<=0 || bounce>=1 || window>h) {
        return -1
    } else {
        var newHeight = h * bounce;
        var views = 1;
        while (newHeight>window) {
            newHeight *= bounce
            views += 2;
        }
        return views;
    }
}