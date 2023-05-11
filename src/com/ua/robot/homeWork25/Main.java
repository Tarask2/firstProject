package com.ua.robot.homeWork25;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread userThread = new MyThread();
        Thread thread = new Thread(userThread);
        thread.start();


    }
}
