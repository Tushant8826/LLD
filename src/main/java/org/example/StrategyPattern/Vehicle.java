package org.example.StrategyPattern;

import org.example.StrategyPattern.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    protected Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
