package com.ua.robot.homeWork9;

public class Teacher {
    private String name;
    private int age;
    private String subjectTeach;
    private int howLongWork;

    public Teacher(String name, int age, String subjectTeach, int howLongWork) {
        this.name = name;
        this.age = age;
        this.subjectTeach = subjectTeach;
        this.howLongWork = howLongWork;
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

    public String getSubjectTeach() {
        return subjectTeach;
    }

    public void setSubjectTeach(String subjectTeach) {
        this.subjectTeach = subjectTeach;
    }

    public int getHowLongWork() {
        return howLongWork;
    }

    public void setHowLongWork(int howLongWork) {
        this.howLongWork = howLongWork;
    }

    public void teachJava() {
        System.out.println("Teach Java every day!!!");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subjectTeach='" + subjectTeach + '\'' +
                ", howLongWork=" + howLongWork +
                '}';
    }
}
