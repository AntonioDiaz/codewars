package com.kata6;

//https://www.codewars.com/kata/primorial-of-a-number/train/java

import java.math.BigInteger;

public class Primorial {


    static boolean isPrimeAux(int n) {
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static boolean isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }


    public static String numPrimorial(int n) {
        int cont = 2;
        int primes = 0;
        BigInteger multi = new BigInteger("1");
        while (primes<n) {
            if (isPrime(cont)) {
                primes++;
                multi = multi.multiply(new BigInteger(Integer.toString(cont)));
            }
            cont++;
        }
        return multi.toString();
    }
}
