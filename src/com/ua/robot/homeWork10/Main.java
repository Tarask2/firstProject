package com.ua.robot.homeWork10;

public class Main {
    public static void main(String[] args) {

        LightWeightCar lightWeightCar = new LightWeightCar("lightCar", 1500, 300, "Audi", "Sedan", 2023);
        Truck truck = new Truck("Truk", 7000, 700, "Volvo", 2023, 50000);
        lightWeightCar.whatTypeOfCar();
        truck.whatTypeOfCar();

    }
}
