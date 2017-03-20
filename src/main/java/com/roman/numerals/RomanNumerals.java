package com.roman.numerals;

public class RomanNumerals {
    public String convertToRoman(int arabic) {

        String roman = "";

        if (arabic == 9) {
             roman = "IX";
        }
        else if (arabic >= 5) {
            roman = "V" + repeat(arabic - 5);
        }
        else if (arabic == 4) {
            roman = "IV";
        }
        else {
            roman += repeat(arabic);
        }
        return roman;
    }
    private String repeat(int times) {
        String repeatedNum = "";

        for (int i = 0; i < times; i++) {
            repeatedNum += "I";
        }
        return repeatedNum;
    }
}
