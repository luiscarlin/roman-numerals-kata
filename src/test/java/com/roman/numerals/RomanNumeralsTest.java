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
    public void shouldConvert1ToI() throws Exception {
        assertArabicConvertsToRoman(1, "I");
    }

    @Test
    public void shouldConvert2ToII() throws Exception {
        assertArabicConvertsToRoman(2, "II");
    }

    @Test
    public void shouldConvert3ToIII() throws Exception {
        assertArabicConvertsToRoman(3, "III");
    }

    @Test
    public void shouldConvert4ToIV() throws Exception {
        assertArabicConvertsToRoman(4, "IV");
    }
}
