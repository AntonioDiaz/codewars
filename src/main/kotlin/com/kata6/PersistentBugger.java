package com.kata6;

import java.util.Arrays;

public class PersistentBugger {

    public static int persistence(long n) {
        int cont = 0;
        while (n>=10) {
            n = Arrays.stream(Long.toString(n).split("")).map(Integer::parseInt).reduce(1, (a, b) -> a * b);
            cont++;
        }
        return cont;
    }

}
