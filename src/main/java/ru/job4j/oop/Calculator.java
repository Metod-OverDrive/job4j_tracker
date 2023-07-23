package ru.job4j.oop;

public class Calculator {

    private static final int X = 50;

    public static int sum(int y) {
        return X + y;
    }

    public static int minus(int y) {
        return X - y;
    }

    public int divide(int y) {
        return X / y;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + this.divide(y);
    }





    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = Calculator.sum(10);
        System.out.println(result);

        result = Calculator.minus(10);
        System.out.println(result);

        result = calculator.divide(10);
        System.out.println(result);

        result = calculator.sumAllOperation(10);
        System.out.println(result);
    }
}