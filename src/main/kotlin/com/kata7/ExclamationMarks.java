package com.kata7;

//https://www.codewars.com/kata/exclamation-marks-series-number-5-remove-all-exclamation-marks-from-the-end-of-words/

public class ExclamationMarks {

    public static String removeBang(String str) {
        return str.replaceAll("!+\\s", " ")
                .replaceAll("!+$", "");
    }
}
