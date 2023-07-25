package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item example = new Item("Example");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentData = example.getCreated().format(format);
        System.out.println(currentData);
    }
}
