package com.kata7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ComplementaryDnaTest {

    @Test
    public void test01() {
        assertEquals("TTTT", ComplementaryDna.makeComplement("AAAA"));
    }
    @Test
    public void test02() {
        assertEquals("TAACG", ComplementaryDna.makeComplement("ATTGC"));
    }
    @Test
    public void test03() {
        assertEquals("CATA", ComplementaryDna.makeComplement("GTAT"));
    }
}
