package com.kata7

//https://www.codewars.com/kata/circular-list/

class CircularList<T>(vararg val elements: T) {

    private var index: Int = -1

    init {
        if (elements.isEmpty()) {
            throw Exception();
        }
    }

    fun next(): T {
        if (index==elements.size -1) {
            index = -1
        }
        return elements[++index%elements.size]
    }

    fun prev(): T {
        if (index==-1 || index==0) {
            index = elements.size;
        }
        return elements[--index%elements.size]
    }
}