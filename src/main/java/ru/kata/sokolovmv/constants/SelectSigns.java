package ru.kata.sokolovmv.constants;

public enum SelectSigns {
    PLUS("\\+"),
    MINUS("-"),
    MULTIPLY("\\*"),
    DIVIDE("/");

    private final String sing;

    SelectSigns(String str) {
        this.sing = str;
    }

    public String getSing() {
        return sing;
    }
}
