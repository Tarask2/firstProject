package com.ua.robot.homeWork9;

public class Student {
    private String name;
    private int age;
    private String fieldOfStudy;

    private int yearOfStudy;

    public Student(String name, int age, String fieldOfStudy, int yearOfStudy) {
        this.name = name;
        this.age = age;
        this.fieldOfStudy = fieldOfStudy;
        this.yearOfStudy = yearOfStudy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void studyLess() {
        System.out.println("Study Java every Day !!! ");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                '}';
    }
}
