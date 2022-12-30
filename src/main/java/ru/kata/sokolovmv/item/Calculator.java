package ru.kata.sokolovmv.item;


import ru.kata.sokolovmv.service.SimpleLogic;

import java.text.ParseException;

public class Calculator {
    private final SimpleLogic simpleLogic;

    public Calculator(String readLine) throws ParseException {
        simpleLogic = new SimpleLogic(readLine);
    }

    @Override
    public String toString() {
        return simpleLogic.toString();
    }
}
