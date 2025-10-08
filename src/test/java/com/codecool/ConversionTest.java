package com.codecool;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {
    @Test
    void shouldReturnIWhenDigitIs1AndDecimalPlaceIs0() {
        Conversion conversion = new Conversion();
        StringBuilder result = conversion.GetRomanSymbol('1', 0);
        assertEquals("I", result.toString());
    }

    @Test
    void shouldReturnXWhenDigitIs1AndDecimalPlaceIs1() {
        Conversion conversion = new Conversion();
        StringBuilder result = conversion.GetRomanSymbol('1', 1);
        assertEquals("X", result.toString());
    }

    @Test
    void shouldReturnCWhenDigitIs1AndDecimalPlaceIs2() {
        Conversion conversion = new Conversion();
        StringBuilder result = conversion.GetRomanSymbol('1', 2);
        assertEquals("C", result.toString());
    }

    @Test
    void shouldReturnMWhenDigitIs1AndDecimalPlaceIs3() {
        Conversion conversion = new Conversion();
        StringBuilder result = conversion.GetRomanSymbol('1', 3);
        assertEquals("M", result.toString());
    }
}