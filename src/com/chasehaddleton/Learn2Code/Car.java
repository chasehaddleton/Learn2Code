package com.chasehaddleton.Learn2Code;

public class Car {
    /*
        Instance variables
     */
    double topSpeed;
    int passengerCapacity;
    double fuelEconomy;
    double litresOfFuel;
    String colour;

    Car(double topSpeed, int passengerCapacity, double fuelEconomy, double litresOfFuel, String colour) {
        this.topSpeed = topSpeed;
        this.passengerCapacity = passengerCapacity;
        this.fuelEconomy = fuelEconomy;
        this.litresOfFuel = litresOfFuel;
        this.colour = colour;
    }

    // Number of Km possible to drive.
    double range() {
        return fuelEconomy * litresOfFuel;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double newTopSpeed) {
        topSpeed = newTopSpeed;
    }

    int getPassengerCapacity() {
        return passengerCapacity;
    }

    String getColour() {
        return colour;
    }
}