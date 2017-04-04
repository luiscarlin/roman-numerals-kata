package com.roman.numerals;

public class RomanNumerals {
    public String convertToRoman(int arabic) {

        String roman = "";

        if (arabic == 0) {
            return "NULLA";
        }

        if (arabic < 0 || arabic >= 4000) {
            throw new IllegalArgumentException();
        }

        if (arabic >= 1 && arabic <= 3) {
            roman += repeat(arabic);
        }
        else if (arabic == 4) {
            roman = "IV";
        }
        else if (arabic >= 5 && arabic <= 8) {
            roman = "V" + repeat(arabic - 5);
        }
        else if (arabic == 9) {
            roman = "IX";
        }
        else {
            roman = "X";
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
