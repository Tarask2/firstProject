package com.ua.robot.homeWork16;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        try {
            for (int i = 0; i < 1000; i++) {
                hashSet.add(random.nextInt(i, 51));
                treeSet.add(random.nextInt(i, 51));
                linkedHashSet.add(random.nextInt(i, 51));
            }
        } catch (Exception e) {
            System.out.print(" TreeSet" + "\t\t" + treeSet + "\n" + " HashSet" + "\t\t" + hashSet + "\n" + " LinkedHashSet  " + linkedHashSet);

        }
    }
}
