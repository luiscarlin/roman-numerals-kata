package com.roman.numerals;

public class RomanNumerals {
    public String convertToRoman(int arabic) {

        String roman = "";

        if (arabic < 0 || arabic >= 4000) {
            throw new IllegalArgumentException();
        }

        if (arabic == 0) {
            return RomanChars.NULLA;
        }

        if (arabic == 1000) {
            return RomanChars.M;
        }

        int hundredsDigit = arabic/100;
        if (hundredsDigit != 0) {
            roman = convertDigit(hundredsDigit, RomanChars.C, RomanChars.D, RomanChars.M);

            // two digit number
            arabic = arabic % 100;
        }

        int tensDigit = arabic/10;
        if (tensDigit != 0) {
            roman = roman + convertDigit(tensDigit, RomanChars.X, RomanChars.L, RomanChars.C);

            // one digit number
            arabic = arabic % 10;
        }

        int onesDigit = arabic;
        if (onesDigit != 0) {
            roman = roman + convertDigit(onesDigit, RomanChars.I, RomanChars.V, RomanChars.X);
        }

        return roman;
    }

    private String convertDigit(int digitToConvert, String onePosition, String fivePosition, String nextPowerOfTen) {
        String roman = "";

        if (digitToConvert == 4) {
            roman = onePosition + fivePosition;
        }
        else if (digitToConvert >= 5 && digitToConvert <= 8) {
            roman = fivePosition + repeat(onePosition, digitToConvert - 5);

        }
        else if (digitToConvert == 9) {
            roman = onePosition + nextPowerOfTen;
        }
        else {
            roman += repeat(onePosition, digitToConvert);
        }

        return roman;
    }

    private String repeat(String charToRepeat, int times) {
        String repeatedNum = "";

        for (int i = 0; i < times; i++) {
            repeatedNum += charToRepeat;
        }
        return repeatedNum;
    }
}
