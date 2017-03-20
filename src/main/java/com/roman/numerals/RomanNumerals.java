package com.roman.numerals;

public class RomanNumerals {
    public String convertToRoman(int arabic) {

        String roman = "";

        if (arabic == 5) {
            roman = "V";
        }
        else if (arabic == 4) {
            roman = "IV";
        }
        else {
            for (int i = 0; i < arabic; i++) {
                roman += "I";
            }
        }
        return roman;
    }
}
