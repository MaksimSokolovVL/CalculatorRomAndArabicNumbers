package ru.kata.sokolovmv.item;

public class Minus implements Minusable {
    @Override
    public int subtraction(int[] a) {
        return a[0] - a[1];
    }
}
