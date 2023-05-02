package com.ua.robot.homeWork25;

public class Main {

    private static Thread.State state;

    public static void main(String[] args)  {
        ThreadClass threadClass = new ThreadClass();
        Thread th = new Thread(threadClass);
        th.setName("Thread_1 ");
        th.start();





    }
}
