package com.ua.robot.homeWork9;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Bogdan", 22, "IT specialist", 3);
        Teacher teacher = new Teacher("Stepan Romanowych", 50, "Java", 18);

        Array array = new Array();
        array.greatArrayRandom();
        array.sortArray();
        array.displyArray();

    }

}

