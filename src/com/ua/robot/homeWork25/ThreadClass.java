package com.ua.robot.homeWork25;


public class ThreadClass implements Runnable {

    @Override
    synchronized public void run() {
        while (true) {

            for (int i = 0; i <= 10; i++) {

                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i == 5) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }


                }

                System.out.println(Thread.currentThread().getName() + " " + i);
                }


            }
        }
    }
