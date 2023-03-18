package com.ua.robot.homeWork15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Task 1
        ArrayAndLinked task1 = new ArrayAndLinked();
        task1.saveElementsArrayList(10);
        task1.saveElementsLinkedList(2000);


        //Task 2-3
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Petro"));
        studentList.add(new Student("Vasyl"));
        studentList.add(new Student("Ivan"));
        studentList.add(new Student("Dmytro"));
        studentList.add(new Student("Maksym"));
        System.out.println(studentList);



    }
}
