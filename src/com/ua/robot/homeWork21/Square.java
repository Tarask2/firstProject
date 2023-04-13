package com.ua.robot.homeWork21;

public class Square {
    public double square(double number) {
        if (number < 0) {
            throw new ArithmeticException("A number less than zero");
        }
        return Math.pow(number, 2);
    }
}
