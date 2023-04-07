package com.ua.robot.homeWork20;

import java.util.Scanner;

public class Task_3 {


    void infinityLoop() {
        int myNumber = 100;
        try {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                if (number == myNumber) {
                    System.out.println("Yes you guessed it");
                    break;
                }
                if (number < 0) {
                    System.out.println("Only positive number");
                }
                System.out.println("Missed!!!Try again!!!");

            }
        } catch (Exception e) {
            System.out.println("Write only integer ");


        }

    }
}
