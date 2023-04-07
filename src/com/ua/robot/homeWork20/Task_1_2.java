package com.ua.robot.homeWork20;

import java.util.Scanner;
public class Task_1_2 {

    void writeNumber( ) {
        try {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Write number: ");
            int number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error to the console.You must write only number ");
        }
    }
}

