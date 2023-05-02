package com.ua.robot.homeWork26;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Callable<Integer>> callables = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            callables.add(new MyCallable());
            ExecutorService executorService = Executors.newFixedThreadPool(10);
            List<Future<Integer>> futures = executorService.invokeAll(callables);

            for (Future<Integer> future : futures) {
                System.out.println(future.get());
            }

        }

    }
}
