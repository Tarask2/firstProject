package com.ua.robot.homeWork11;

public class Child extends Parent {

    static {
        System.out.println("2");
    }

    {
        System.out.println("2");
    }


    public Child() {
        System.out.println("2");
    }
}
