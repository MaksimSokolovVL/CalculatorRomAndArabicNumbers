package ru.kata.sokolovmv.item;

public class Plus implements Plusable {
    @Override
    public int summation(int[] arrayInt) {
        return arrayInt[0] + arrayInt[1];
    }
}
