package com.roman.numerals;

public class RomanNumerals {
    public String convertToRoman(int arabic) {

        String roman = "";

        if (arabic == 4) {
            return "IV";
        }

        for (int i = 0; i < arabic; i++) {
            roman += "I";
        }
        return roman;
    }
}
