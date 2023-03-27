package com.ua.robot.homeWork18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Володя", 4));
        studentList.add(new Student("Степан", 4.4));
        studentList.add(new Student("Роман", 3.8));
        System.out.println("Не відсортований: " + studentList);
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                return o1.getSurname().compareTo(o2.getSurname());
            }
        });
        System.out.println("Відсортований за прізвищем: " + studentList);

        studentList.sort((o1, o2) -> Double.compare(o1.getGpa(), o2.getGpa()));
        System.out.println("Відсортований за cереднім балом: " + studentList);

    }
}