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

    public String solution(int number){
        return romanNumeralsEncoder(number);
    }

    private String romanNumeralsEncoder(int number) {
        if (number >= 4000) throw new Error("Unsupported number");
        String digits = Integer.toString(number);
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < digits.length(); index++) {
            char digit = digits.charAt(index);
            StringBuilder character = getRomanSymbol(digit, digits.length() - 1 - index);
            result.append(character);
        }
        return result.toString();
    }

    StringBuilder getRomanSymbol(char digit, int decimalPlace) {
        int intNum = Integer.parseInt(String.valueOf(digit));
        int divByFive = intNum / 5;
        int modByFive = intNum % 5;
        int symbolIndex = (int)Math.pow(10, decimalPlace);

        StringBuilder result = new StringBuilder();

        if (modByFive == 4) {
            return new StringBuilder(symbols.get(symbolIndex) + symbols.get(symbolIndex * 5 * (divByFive + 1)));
        } else {
            if (divByFive != 0) {
                result.append(symbols.get(symbolIndex * 5));
            }
            result.append(symbols.get(symbolIndex).repeat(modByFive));
        }
        return result;
    }
}

