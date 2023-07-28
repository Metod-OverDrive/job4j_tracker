package ru.job4j.ex;

public class Fact {
    public int calc(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("N could not be less than 0");
        }
        int rsl = 1;
        for (int index = 2; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        new Fact().calc(-1);
    }
}