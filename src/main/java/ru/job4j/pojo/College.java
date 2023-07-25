package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setOwner("Иван Иванович Иванов");
        student.setGroup("pin-b-o-22-1");
        student.setCreated(LocalDate.now());
        System.out.println(student.getOwner()
                + " учится на курсе " + student.getGroup()
                + " : " + student.getCreated());
    }
}
