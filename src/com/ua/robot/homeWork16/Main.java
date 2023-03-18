package com.ua.robot.homeWork16;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        try {
            for (int i = 0; i < 1000; i++) {
                Random random = new Random();
                HashSet<Integer> hashSet = new HashSet<>();
                TreeSet<Integer> treeSet = new TreeSet<>();
                LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
                int arr = random.nextInt(i,51);
                hashSet.add(random.nextInt(i, 51));
                treeSet.add(random.nextInt(i, 51));
                linkedHashSet.add(random.nextInt(i, 51));


                System.out.println(" TreeSet " + treeSet + "\t\t" + " HashSet " + hashSet + "\t\t" + " LinkedHashSet " + linkedHashSet);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
