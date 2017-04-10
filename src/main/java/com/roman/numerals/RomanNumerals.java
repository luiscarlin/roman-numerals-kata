package com.roman.numerals;

public class RomanNumerals {
    public String convertToRoman(int arabic) {

        StringBuilder romanSb = new StringBuilder();

        if (arabic < 0 || arabic >= 4000) {
            throw new IllegalArgumentException();
        }

        if (arabic == 0) {
            return RomanChars.NULLA;
        }

        int thousandsDigit = arabic/1000;
        if (thousandsDigit != 0) {
            romanSb.append(repeat(RomanChars.M, thousandsDigit));

            // three digit number
            arabic = arabic % 1000;
        }

        int hundredsDigit = arabic/100;
        if (hundredsDigit != 0) {
            romanSb.append(convertDigit(hundredsDigit, RomanChars.C, RomanChars.D, RomanChars.M));

            // two digit number
            arabic = arabic % 100;
        }

        int tensDigit = arabic/10;
        if (tensDigit != 0) {
            romanSb.append(convertDigit(tensDigit, RomanChars.X, RomanChars.L, RomanChars.C));

            // one digit number
            arabic = arabic % 10;
        }

        int onesDigit = arabic;
        if (onesDigit != 0) {
            romanSb.append(convertDigit(onesDigit, RomanChars.I, RomanChars.V, RomanChars.X));
        }

        return romanSb.toString();
    }

    private String convertDigit(int digitToConvert, String onePosition, String fivePosition, String nextPowerOfTen) {

        StringBuilder romanSb = new StringBuilder();

        if (digitToConvert == 4) {
            romanSb.append(onePosition + fivePosition);
        }
        else if (digitToConvert >= 5 && digitToConvert <= 8) {
            romanSb.append(fivePosition + repeat(onePosition, digitToConvert - 5));

        }
        else if (digitToConvert == 9) {
            romanSb.append(onePosition + nextPowerOfTen);
        }
        else {
            romanSb.append(repeat(onePosition, digitToConvert));
        }

        return romanSb.toString();
    }

    private String repeat(String charToRepeat, int times) {
        StringBuilder romanSb = new StringBuilder();

        for (int i = 0; i < times; i++) {
            romanSb.append(charToRepeat);
        }
        return romanSb.toString();
    }

    public int convertToArabic(String roman) {
        return 0;
    }
}
