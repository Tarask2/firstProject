package com.ua.robot.homeWork15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_1 {

    public void saveElementsArrayList(int capacity) {
        List<Number> numberList = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            numberList.add(i);

        }
        System.out.println(numberList);
    }

    public void saveElementsLinkedList(int capacity) {
        List<Number> arrayList = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            arrayList.add(i);

        }

        System.out.println(arrayList);
    }


}




