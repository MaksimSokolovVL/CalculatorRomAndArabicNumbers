package ru.kata.sokolovmv.service;

import ru.kata.sokolovmv.constants.SelectSigns;
import ru.kata.sokolovmv.exception.RangeOfLimitationsException;
import ru.kata.sokolovmv.item.*;

import java.text.ParseException;


public class CalculationRome {
    private final NumberConverter numberConverter = new NumberConverter();
    private String result;

    public CalculationRome(String readLine) throws ParseException {
        selectionArithmeticOperation(readLine);
    }

    private void selectionArithmeticOperation(String inputString) throws ParseException {
        String regex = "[\s\\w]+";

        String selector = inputString.replaceAll(regex, "");

        switch (selector) {
            case "+" ->
                    result = numberConverter.toRoman(new Plus().summation(transformationString(inputString, SelectSigns.PLUS.getSing())));
            case "-" ->
                    result = numberConverter.toRoman(new Minus().subtraction(transformationString(inputString, SelectSigns.MINUS.getSing())));
            case "/" ->
                    result = numberConverter.toRoman(new Divide().dividing(transformationString(inputString, SelectSigns.DIVIDE.getSing())));
            case "*" ->
                    result = numberConverter.toRoman(new Multiply().multiplication(transformationString(inputString, SelectSigns.MULTIPLY.getSing())));
            default -> throw new IllegalArgumentException("There is no such action! Only +,-,*,/");
        }
    }

    private int[] transformationString(String rawString, String arithmeticSign) throws ParseException {
        String strDeleteSpase = rawString.replaceAll("\\s+", "");
        String[] strArray = strDeleteSpase.split(arithmeticSign);

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = numberConverter.toArabic(strArray[i]);
        }
        int fistNumber = Integer.parseInt(strArray[0]);
        int secondNumber = Integer.parseInt(strArray[1]);

        if ((fistNumber < 1 || fistNumber > 10) || (secondNumber < 1 || secondNumber > 10)) {
            throw new RangeOfLimitationsException("Вводите данные от I до X");
        }

        return new int[]{fistNumber, secondNumber};
    }

    @Override
    public String toString() {
        return result + "";
    }
}



