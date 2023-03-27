package com.ua.robot.homeWork18;

import java.util.Comparator;

public class Student {
    private final String surname;
    private final double gpa;

    public Student(String surname, double gpa) {
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getSurname() {
        return surname;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return
                surname + "," +
                        " середній бал - " + gpa;
    }
}
