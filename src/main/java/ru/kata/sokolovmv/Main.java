package ru.kata.sokolovmv;

import ru.kata.sokolovmv.item.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            startMessage();
            
            String readLine = reader.readLine();

            System.out.printf("Результат равен: %s\n", calc(readLine));
        } catch (IOException | ParseException | InterruptedException exception) {
            throw new RuntimeException(exception);
        }
    }

    private static void startMessage() throws InterruptedException {
        String massage = "Использовать можно только целые арабские цифры от 1 до 10 или только Римские(I,I,V,X...)\n" +
                "Что будем считать?: ";
        System.err.print("Внимание! -> ");
        Thread.sleep(10);
        System.out.print(massage);
    }

    public static String calc(String input) throws ParseException {
        Calculator calculator = new Calculator(input);
        return calculator.toString();
    }
}