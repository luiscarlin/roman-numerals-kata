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

    @Test
    public void shouldConvert10() throws Exception {
        assertArabicConvertsToRoman(10, "X");
    }

    @Test
    public void shouldConvert50() throws Exception {
        assertArabicConvertsToRoman(50, "L");
    }

    @Test
    public void shouldConvert100() throws Exception {
        assertArabicConvertsToRoman(100, "C");
    }

    @Test
    public void shouldConvert500() throws Exception {
        assertArabicConvertsToRoman(500, "D");
    }
}
