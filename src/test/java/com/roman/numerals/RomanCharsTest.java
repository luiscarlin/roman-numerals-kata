package com.roman.numerals;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class RomanCharsTest {
    @Test
    public void shouldReturnCharInstance() throws Exception {
        RomanChars chars = new RomanChars();
        assertNotNull(chars);
    }

    @Test
    public void shouldReturnCorrectValue() throws Exception {
        assertThat(RomanChars.NULLA, is("NULLA"));
        assertThat(RomanChars.I, is("I"));
        assertThat(RomanChars.V, is("V"));
        assertThat(RomanChars.X, is("X"));
        assertThat(RomanChars.L, is("L"));
        assertThat(RomanChars.C, is("C"));
        assertThat(RomanChars.D, is("D"));
        assertThat(RomanChars.M, is("M"));
    }
}
