package com.codecool;

import java.util.HashMap;

public class Conversion {
    private final HashMap<Integer, String> symbols = new HashMap<>() {{
        put(1, "I");
        put(5, "V");
        put(10, "X");
        put(50, "L");
        put(100, "C");
        put(500, "D");
        put(1000, "M");
    }};

    StringBuilder GetRomanSymbol(char digit, int decimalPlace) {

        StringBuilder result = new StringBuilder();

        // 4 vagy 9 -es eset
        if () {
            return new StringBuilder();
        } else {
            // 5-ös eset
            if () {
                result.append("");
            }
            // 1-2-3-6-7-8 eset
            result.append("");
        }
        return result;
    }
}

