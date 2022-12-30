package ru.kata.sokolovmv.item;

public class Multiply implements Multiplable{
    @Override
    public int multiplication(int[] a) {
        return a[0]*a[1];
    }
}
