package com.ua.robot.homeWork10;

public class Car {
    private String typeCar;
    private int wieght;
    private int horsePower;

    public Car(String typeCar, int wieght, int horsePower) {
        this.typeCar = typeCar;
        this.wieght = wieght;
        this.horsePower = horsePower;

    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }


    public int getWieght() {
        return wieght;
    }

    public void setWieght(int wieght) {
        this.wieght = wieght;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String whatTypeOfCar() {
        return "";
    }

    @Override
    public String toString() {
        return "Car{" +
                "typeCar='" + typeCar + '\'' +
                ", wieght=" + wieght +
                ", horsePower=" + horsePower +
                '}';
    }
}
