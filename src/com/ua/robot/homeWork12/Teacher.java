package com.ua.robot.homeWork12;

public class Teacher extends DiscribeAbstract {
    private String name;
    private String surname;
    private int age;
    private String lesson;

    public Teacher() {

    }

    public Teacher(String name, String surname, int age,String lesson) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public void introduceYourself() {
        System.out.println("Hello!!!My name " + getName() + " " + getSurname() + "\n" +
                "I am " + getAge() + " years old");
    }

    @Override
    public void whatDoYouDo() {
        System.out.println("I am a teacher "+getLesson()+"\n");
    }

    @Override
    public void present() {
        introduceYourself();
        whatDoYouDo();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
