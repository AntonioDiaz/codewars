package com.kata7;

//https://www.codewars.com/kata/regex-validate-pin-code/train/java

public class RegexValidatePinCode {

    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }
}
