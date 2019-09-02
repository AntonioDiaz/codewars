package com.kata6;

import java.util.stream.IntStream;

public class Multiples3or5 {
    public int solution(int number) {
        return IntStream.rangeClosed(1, number-1).map(e->(e%3==0||e%5==0)?e:0).sum();
    }
}
