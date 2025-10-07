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

    StringBuilder getRomanSymbol(char digit, int decimalPlace) {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}

