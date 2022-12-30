package ru.kata.sokolovmv.service;

import ru.kata.sokolovmv.constants.SelectSigns;
import ru.kata.sokolovmv.exception.RangeOfLimitationsException;
import ru.kata.sokolovmv.item.*;


public class CalculationArabic {
    private int result;

    public CalculationArabic(String readLine) {
        selectionArithmeticOperation(readLine);
    }

    private void selectionArithmeticOperation(String inputString) {
        String regex = "[\s\\w]+";

        String selector = inputString.replaceAll(regex, "");

        switch (selector) {
            case "+" -> result = new Plus().summation(transformationString(inputString, SelectSigns.PLUS.getSing()));
            case "-" ->
                    result = new Minus().subtraction(transformationString(inputString, SelectSigns.MINUS.getSing()));
            case "/" -> result = new Divide().dividing(transformationString(inputString, SelectSigns.DIVIDE.getSing()));
            case "*" ->
                    result = new Multiply().multiplication(transformationString(inputString, SelectSigns.MULTIPLY.getSing()));
            default -> throw new IllegalArgumentException("Seriously?!");
        }
    }

    private int[] transformationString(String rawString, String arithmeticSign) {
        String strDellSpase = rawString.replaceAll("\\s+", "");
        String[] strArray = strDellSpase.split(arithmeticSign);
        int fistNumber = Integer.parseInt(strArray[0]);
        int secondNumber = Integer.parseInt(strArray[1]);

        if ((fistNumber < 1 || fistNumber > 10) || (secondNumber < 1 || secondNumber > 10)) {
            throw new RangeOfLimitationsException("Вводите данные от 1 до 10");
        }

        return new int[]{fistNumber, secondNumber};
    }

    @Override
    public String toString() {
        return result + "";
    }
}



