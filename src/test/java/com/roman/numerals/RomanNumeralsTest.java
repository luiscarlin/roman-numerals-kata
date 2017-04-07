package com.roman.numerals;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class RomanNumeralsTest {
    RomanNumerals underTest;

    private void assertArabicConvertsToRoman(int arabic, String expectedRoman) {
        String roman = underTest.convertToRoman(arabic);
        assertThat(roman, is(equalTo(expectedRoman)));
    }

    @Before
    public void setUp() throws Exception {
        underTest = new RomanNumerals();
    }

    @Test
    public void shouldReturnNullaFor0() throws Exception {
        assertArabicConvertsToRoman(0, "NULLA");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForNegativeNumber() throws Exception {
        underTest.convertToRoman(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForLargeNumber() throws Exception {
        underTest.convertToRoman(4000);
    }

    @Test
    public void shouldConvertSingleDigit1To3() throws Exception {
        assertArabicConvertsToRoman(1, "I");
        assertArabicConvertsToRoman(2, "II");
        assertArabicConvertsToRoman(3, "III");
    }

    @Test
    public void shouldConvertSingleDigit4() throws Exception {
        assertArabicConvertsToRoman(4, "IV");
    }

    @Test
    public void shouldConvertSingleDigit5To8() throws Exception {
        assertArabicConvertsToRoman(5, "V");
        assertArabicConvertsToRoman(6, "VI");
        assertArabicConvertsToRoman(7, "VII");
        assertArabicConvertsToRoman(8, "VIII");
    }

    @Test
    public void shouldConvertSingleDigit9() throws Exception {
        assertArabicConvertsToRoman(9, "IX");
    }

    @Test
    public void shouldConvertPowersOfTenBelow100() throws Exception {
        assertArabicConvertsToRoman(10, "X");
        assertArabicConvertsToRoman(20, "XX");
        assertArabicConvertsToRoman(30, "XXX");
        assertArabicConvertsToRoman(40, "XL");
        assertArabicConvertsToRoman(50, "L");
        assertArabicConvertsToRoman(60, "LX");
        assertArabicConvertsToRoman(70, "LXX");
        assertArabicConvertsToRoman(80, "LXXX");
        assertArabicConvertsToRoman(90, "XC");
    }

    @Test
    public void shouldConvertDoubleDigitsBelow100ThatAreNotPowerOfTen() throws Exception {
        assertArabicConvertsToRoman(13, "XIII");
        assertArabicConvertsToRoman(14, "XIV");
        assertArabicConvertsToRoman(64, "LXIV");
        assertArabicConvertsToRoman(99, "XCIX");
        assertArabicConvertsToRoman(55, "LV");
        assertArabicConvertsToRoman(33, "XXXIII");
        assertArabicConvertsToRoman(44, "XLIV");
        assertArabicConvertsToRoman(25, "XXV");
        assertArabicConvertsToRoman(17, "XVII");
    }

    @Test
    public void shouldConvertPowersOfTenBelow1000AndAbove100() throws Exception {
        assertArabicConvertsToRoman(100, "C");
        assertArabicConvertsToRoman(200, "CC");
        assertArabicConvertsToRoman(300, "CCC");
        assertArabicConvertsToRoman(400, "CD");
        assertArabicConvertsToRoman(500, "D");
        assertArabicConvertsToRoman(600, "DC");
        assertArabicConvertsToRoman(700, "DCC");
        assertArabicConvertsToRoman(800, "DCCC");
        assertArabicConvertsToRoman(900, "CM");
    }

    @Test
    public void shouldConvertFourDigits1000() throws Exception {
        assertArabicConvertsToRoman(1000, "M");
    }
}
