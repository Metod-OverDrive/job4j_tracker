package ru.job4j.checkstyle;

public class Broken {

    private int sizeOfEmpty = 10;
    String name;
    public String surname;
    public static final String NEW_VALUE = "";

    public Broken() { }

    void echo() {
    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void method(int a, int b, int c) { }

}