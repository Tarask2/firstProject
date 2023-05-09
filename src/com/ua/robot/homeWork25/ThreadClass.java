package com.ua.robot.homeWork25;


public class ThreadClass implements Runnable {
    Thread thread;


    @Override
    synchronized public void run() {
        while (true) {

            for (int i = 0; i <= 10; i++) {
                if (i == 5) {
                    thread.interrupt();
                }

                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                System.out.println(Thread.currentThread().getName() + " " + i);
            }


        }
    }
}
