package com.ua.robot.homeWork19;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        /////Task1

        List<People> surnameList = List.of(
                new People("Шевченко"),
                new People("Шекспір"),
                new People("Kiз"),
                new People("Шекспір"),
                new People("Шевченко"),
                new People("Тичина"),
                new People("Франко"),
                new People("Шевченко"),
                new People("Тичина"),
                new People("Kiocакі"),
                new People("Тичина"),
                new People("Вовчок"),
                new People("Вовчок"),
                new People("Шекспір"),
                new People("Шекспір"),
                new People("Шекспір"),
                new People("Робертс"),
                new People("Kiocакі"),
                new People("Франко"));

        Map<String, List<People>> result = surnameList.stream()
                .collect(Collectors.groupingBy(People::getSurname));
        System.out.println(result);
        System.out.println();


        ////Task 2

        Stream<Integer> randStream = Stream.generate(() -> new Random()
                        .nextInt(1, 10))
                .limit(10);
        List<Integer> filteredList = Collections.singletonList(randStream
                .filter(e -> e > 0)
                .peek(System.out::print)
                .reduce(0, Integer::sum));
        System.out.println("= " + filteredList);


    }
}


//        Random random = new Random();
//        List<Integer> integerList = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            integerList.add(random.nextInt(i, 10));
//        }
//            System.out.println(integerList);
//            Integer sum = integerList.stream()
//                    .reduce(0, Integer::sum);
//            System.out.println(sum);
//
//        }


