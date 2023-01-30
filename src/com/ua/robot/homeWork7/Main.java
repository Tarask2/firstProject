package com.ua.robot.homeWork7;
/*
 1.Створити метод який повертає куб заданого числа

 2.Метод повинен вивести зірочку стільки разів,скільки передав користувач у метод

 3.Метод повинен вивести переданий символ стільки разів,скільки передав користувач у метод
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cube of the given number: " + returnCube());
        System.out.println("-------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times to enter an star: ");
        star(scanner.nextInt(), '*');
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("How many times to enter an symbol: ");
        doubleSymbol(scanner.nextInt(), '#');
    }

    public static int returnCube() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Writte number: ");
        int number = scanner.nextInt();
        return number * number * number;
    }

    public static void star(int scan, char symbol) {
        for (int i = 0; i < scan; i++) {
            System.out.print(symbol);
        }
    }

    public static void doubleSymbol(int scan, char sym) {
        star(scan, sym);
        System.out.println(sym);
    }
}




