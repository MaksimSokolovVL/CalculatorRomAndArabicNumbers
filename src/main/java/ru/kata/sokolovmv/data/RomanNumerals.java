package ru.kata.sokolovmv.data;


import java.util.*;

public class RomanNumerals {
    private final TreeMap<Integer, String> romanNumerals = new TreeMap<>();

    public TreeMap<Integer, String> getRomanNumbers() {

        if (romanNumerals.size() == 0) {
            initRomanNumerals();
        }
        return romanNumerals;
    }

    private void initRomanNumerals() {
        romanNumerals.put(100, "C");
        romanNumerals.put(90, "XC");
        romanNumerals.put(50, "L");
        romanNumerals.put(40, "XL");
        romanNumerals.put(10, "X");
        romanNumerals.put(9, "IX");
        romanNumerals.put(8, "VIII");
        romanNumerals.put(7, "VII");
        romanNumerals.put(6, "VI");
        romanNumerals.put(5, "V");
        romanNumerals.put(4, "IV");
        romanNumerals.put(3, "III");
        romanNumerals.put(2, "II");
        romanNumerals.put(1, "I");
    }
}
