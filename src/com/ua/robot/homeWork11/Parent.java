package com.ua.robot.homeWork11;

public class Parent {


    static {
        System.out.println("1");
    }

    {
        System.out.println("3");
    }


    public Parent() {
        System.out.println("4");
    }
}
