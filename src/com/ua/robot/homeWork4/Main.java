package com.ua.robot.homeWork4;

public class Main {
    public static void main(String[] args) {
        String word = "I'm starting a Java course at robot_dreams and" + " already know how to use Git";

        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());

        System.out.println("First letter - " + word.charAt(0));
        System.out.println("Last letter - " + word.charAt(word.length() - 1));

    }
}
