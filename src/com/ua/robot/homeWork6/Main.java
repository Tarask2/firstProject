package com.ua.robot.homeWork6;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("-----------------------------------------");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        System.out.println();
        System.out.println("-----------------------------------------");


        int factorial = 1;
        int number = 7;
        for (int i = 1; i <= number; i++) {
            factorial *= i;

        }
        System.out.println("Factorial of " + number + " is " + factorial);

        System.out.println();
        System.out.println("-----------------------------------------");

        int maxNumber = 100;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.print("Fibonacci " + maxNumber + " numbers:");
        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            if (previousNumber >= 100) {
                break;
            }
        }
    }
}
