package com.kata7

import com.kata7.partlist
import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*

class PartOfAListKtTest {
    private fun testing(actual:String, expected:String) {
        assertEquals(expected, actual)
    }

    @Test
    fun partlist() {
        println("Fixed Tests partlist")
        var s1 = arrayOf<String>("cdIw", "tzIy", "xDu", "rThG")
        var a = "[[cdIw, tzIy xDu rThG], [cdIw tzIy, xDu rThG], [cdIw tzIy xDu, rThG]]"
        testing(Arrays.deepToString(partlist(s1)), a)
        s1 = arrayOf<String>("I", "wish", "I", "hadn't", "come")
        a = "[[I, wish I hadn't come], [I wish, I hadn't come], [I wish I, hadn't come], [I wish I hadn't, come]]"
        testing(Arrays.deepToString(partlist(s1)), a)
    }

}
