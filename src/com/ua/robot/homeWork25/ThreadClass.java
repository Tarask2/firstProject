package com.ua.robot.homeWork25;



public class ThreadClass implements Runnable {
    Thread th;

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                if (i == 5) {
                    th.isAlive();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
