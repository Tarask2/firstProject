package com.ua.robot.homeWork17;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> ukrMap = new HashMap<>();
        ukrMap.put("привіт", List.of("hello", "hallo", "こんにちは"));
        ukrMap.put("ручка", List.of("pen", "stift", "ペン"));
        ukrMap.put("зошит", List.of("copybook", "heft", "お手本"));
        ukrMap.put("телефон", List.of("phone", "telefon", "電話"));
        ukrMap.put("ноутбук", List.of("laptop", "laptop", "ラップトップ"));
        ukrMap.put("олівець", List.of("pencil", "bleistift", "鉛筆"));
        ukrMap.put("слон", List.of("elephant", "elefant", "象"));
        ukrMap.put("лев", List.of("lion", "löwe", "ライオン"));
        ukrMap.put("робот", List.of("robot", "roboter", "ロボット"));
        ukrMap.put("джава", List.of("java", "java", "ジャワ"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Впишіть слово: ");
        String word = scanner.nextLine().toLowerCase();


        System.out.println(ukrMap.get(word));
    }
}


