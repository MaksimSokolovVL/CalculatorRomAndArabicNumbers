package ru.kata.sokolovmv.service;

import com.github.fracpete.romannumerals4j.RomanNumeralFormat;
import ru.kata.sokolovmv.data.RomanNumerals;

import java.text.ParseException;
import java.util.TreeMap;


public class NumberConverter {
    private final TreeMap<Integer, String> romanNumerals = new RomanNumerals().getRomanNumbers();

    public String toRoman(int number) {
        int l = romanNumerals.floorKey(number);
        if (number == l) {
            return romanNumerals.get(number);
        }
        return romanNumerals.get(l) + toRoman(number - l);
    }

    public String toArabic(String number) throws ParseException {
        RomanNumeralFormat format = new RomanNumeralFormat();
        Number result = format.parse(number);
        return result.toString();
    }
}
