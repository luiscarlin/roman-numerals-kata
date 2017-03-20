package com.roman.numerals;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class RomanNumeralsTest {

    @Test
    public void shouldConvert1ToI() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();
        String roman = romanNumerals.convertToRoman(1);
        assertThat(roman, is(equalTo("I")));
    }
}
