package com.roman.numerals;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

class RomanChars {
    public static final String NULLA = "NULLA";
    public static final String I = "I";
    public static final String V = "V";
    public static final String X = "X";
    public static final String L = "L";
    public static final String C = "C";
    public static final String D = "D";
    public static final String M = "M";

    public static final Map<String, Integer> VALUES = ImmutableMap.<String, Integer>builder()
            .put(I, 1)
            .build();
}
