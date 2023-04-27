package com.ua.robot.homeWork24;

public class Main {
    public static void main(String[] args) {

        ThreadNumber tn = new ThreadNumber();
        Thread thread_1 = new Thread(tn);
        Thread thread_2 = new Thread(tn);
        thread_1.setName("Thread-1");
        thread_1.setName("Thread-2");


        thread_1.start();
        thread_2.start();

    }
}