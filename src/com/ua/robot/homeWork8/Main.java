package com.ua.robot.homeWork8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        randomArr(arr);
        min(arr);
        max(arr);
        avarege(arr);
        sum(arr);

    }

    // 1.Створити програму в якій потрібно створити масив з 10 елементів та заповнити його випадковими числами
    // 2.Вивести його на консоль
    public static void randomArr(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    // 3.Знайти мінімальне значення
    public static void min(int[] array) {
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        System.out.println("Min number: " + minNumber);

    }

    // 4.Знайти максимальне значення
    public static void max(int[] arr) {
        int maxNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }
        System.out.println("Max number: " + maxNumber);

    }

    //5.Знайти середнє значення
    public static void avarege(int[] arr) {
        int average = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            average = sum / arr.length;
        }
        System.out.println("Average number: " + average);

    }

    //6.Знайти суму всіх елементів
    public static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum all elements: " + sum);

    }

}
