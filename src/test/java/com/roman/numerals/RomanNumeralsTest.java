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
    public void shouldConvert1To3() throws Exception {
        assertArabicConvertsToRoman(1, "I");
        assertArabicConvertsToRoman(2, "II");
        assertArabicConvertsToRoman(3, "III");
    }

    @Test
    public void shouldConvert4() throws Exception {
        assertArabicConvertsToRoman(4, "IV");
    }

    @Test
    public void shouldConvert5To8() throws Exception {
        assertArabicConvertsToRoman(5, "V");
        assertArabicConvertsToRoman(6, "VI");
        assertArabicConvertsToRoman(7, "VII");
        assertArabicConvertsToRoman(8, "VIII");
    }

    @Test
    public void shouldConvert9() throws Exception {
        assertArabicConvertsToRoman(9, "IX");
    }
}
