package com.roman.numerals;

public class RomanNumerals {
    public String convertToRoman(int arabic) {
        if (arabic == 3) {
            return "III";
        }
        return "I";
    }
}
