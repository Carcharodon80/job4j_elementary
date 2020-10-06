package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();

        student.setFio("Batman");
        student.setGroup(5);
        student.setDate(LocalDate.of(2020, 1, 17));
        System.out.println("fio - " + student.getFio()
                + ", group - " + student.getGroup()
                + ", date - " + student.getDate());
    }
}
