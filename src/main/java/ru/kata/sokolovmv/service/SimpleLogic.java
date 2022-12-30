package ru.kata.sokolovmv.service;

import java.text.ParseException;

public class SimpleLogic {
    private final String readLine;
    private String result;

    public SimpleLogic(String readLine) throws ParseException {
        this.readLine = readLine;
        validate();
    }

    public void validate() throws ParseException {
        String noSpace = "[\s+\\-*/]+";
        String temp = readLine.replaceAll(noSpace, "");

        if (temp.matches("\\d+")) {
            result = new CalculationArabic(readLine).toString();
        } else if (temp.matches("[CLXIV]+")) {
            result = new CalculationRome(readLine).toString();
        } else {
           throw  new ParseException("Не правильный формат ввода", 1);
        }
    }

    @Override
    public String toString() {
        return result + "";
    }
}

