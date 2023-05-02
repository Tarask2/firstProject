package com.ua.robot.homeWork26;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int i = new Random().nextInt(1,50);
         Thread.sleep(1000);
        return i;

    }
}
