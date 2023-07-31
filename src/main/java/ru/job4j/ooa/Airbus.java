package ru.job4j.ooa;

import net.sf.saxon.style.XSLOutput;

public final class Airbus extends Aircraft {
    private static final int COUNT_ENGINE = 2;

    private final String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printCountEngine() {
        int result = "A380".equals(name) ? 2 : COUNT_ENGINE;
        System.out.println(result);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}