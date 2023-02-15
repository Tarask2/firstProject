package com.ua.robot.homeWork10;

public class LightWeightCar extends Car {
    private String model;
    private String typeBody;
    private int year;


    public LightWeightCar(String typeCar, int wieght, int horsePower, String model, String typeBody, int year) {
        super(typeCar, wieght, horsePower);
        this.model = model;
        this.typeBody = typeBody;
        this.year = year;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeBody() {
        return typeBody;
    }

    public void setTypeBody(String typeBody) {
        this.typeBody = typeBody;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String whatTypeOfCar() {
        return "LightCar";
    }

    @Override
    public String toString() {
        return "LightWeightCar{" +
                "model='" + model + '\'' +
                ", typeBody='" + typeBody + '\'' +
                ", year=" + year +
                '}';
    }
}

