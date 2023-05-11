package com.ua.robot.homeWork25;



class MyThread implements Runnable {
    private volatile boolean exit = false;

    public void run() {
        while (!exit) {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (i == 5) {
                    exit = true;
                    break;
                }
                System.out.println("Thread_1 " + i);
            }

        }
        System.out.println("The  thread is now stopped");
    }

}

