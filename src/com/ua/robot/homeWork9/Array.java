package com.ua.robot.homeWork9;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class Array {
    int[] array = new int[10];
    Random random = new Random();

    public void greatArrayRandom() {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50, 100);
        }
    }

    public void sortArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = 0;
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = 0;
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public void displyArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
