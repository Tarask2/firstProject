package com.ua.robot.homeWork12;

public class Student extends DiscribeAbstract {
    private String name;
    private int age;

    private String courseStudy;

    public Student() {

    }

    public Student(String name, int age, String courseStudy) {
        this.name = name;
        this.age = age;
        this.courseStudy = courseStudy;
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

    public String getCourseStudy() {
        return courseStudy;
    }

    public void setCourseStudy(String courseStudy) {
        this.courseStudy = courseStudy;
    }


    @Override
    public void introduceYourself() {
        System.out.println("Hello!!!My name " + getName() + "\n" +
                "I am " + getAge() + " years old");
    }

    @Override
    public void whatDoYouDo() {
        System.out.println("I am student and I study " + getCourseStudy() + "\n");
    }

    @Override
    public void present() {
        introduceYourself();
        whatDoYouDo();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
