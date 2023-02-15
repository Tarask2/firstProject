package com.ua.robot.homeWork10;

public class Truck extends Car {
    private String model;
    private int year;
    private int weigthCarry;


    public Truck(String typeCar, int wieght, int horsePower, String model, int year, int weigthCarry) {
        super(typeCar, wieght, horsePower);
        this.model = model;
        this.year = year;
        this.weigthCarry = weigthCarry;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWeigthCarry() {
        return weigthCarry;
    }

    public void setWeigthCarry(int weigthCarry) {
        this.weigthCarry = weigthCarry;
    }

    public String whatTypeOfCar() {
        return "Truck";
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", weigthCarry=" + weigthCarry +
                '}';
    }
}
