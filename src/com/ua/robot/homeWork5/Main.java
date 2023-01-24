package com.ua.robot.homeWork5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Writte first number :");
        int number1 = scanner.nextInt();
        System.out.println("Writte second number :");
        int number2 = scanner.nextInt();
        System.out.println("Max number: " + Math.max(number1, number2));
        System.out.println("Min number: " + Math.min(number1, number2));

        System.out.println();
        System.out.println("-----------------------------------------");

        System.out.println("Writte number:");
        number1 = scanner.nextInt();
        if (number1 % 2 == 0) {
            System.out.println("Even: " + number1);
        } else {
            System.out.println("Not even: " + number1);
        }
    }
}
