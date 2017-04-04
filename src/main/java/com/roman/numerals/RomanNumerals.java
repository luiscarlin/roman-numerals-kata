package com.roman.numerals;

public class RomanNumerals {
    public String convertToRoman(int arabic) {

        String roman = "";

        if (arabic == 0) {
            return RomanChars.NULLA;
        }

        if (arabic < 0 || arabic >= 4000) {
            throw new IllegalArgumentException();
        }

        if (arabic == 4) {
            roman = RomanChars.I + RomanChars.V;
        }
        else if (arabic >= 5 && arabic <= 8) {
            roman = RomanChars.V + repeat(arabic - 5);
        }
        else if (arabic == 9) {
            roman = RomanChars.I + RomanChars.X;
        }
        else if (arabic == 10) {
            roman = RomanChars.X;
        }
        else if (arabic == 50) {
            roman = RomanChars.L;
        }
        else if (arabic == 100) {
            roman = RomanChars.C;
        }
        else if (arabic == 500) {
            roman = RomanChars.D;
        }
        else if (arabic == 1000) {
            roman = RomanChars.M;
        }
        else {
            roman += repeat(arabic);
        }

        return roman;
    }
    private String repeat(int times) {
        String repeatedNum = "";

        for (int i = 0; i < times; i++) {
            repeatedNum += RomanChars.I;
        }
        return repeatedNum;
    }
}
