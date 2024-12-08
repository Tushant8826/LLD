package org.example.StrategyPattern;

import org.example.StrategyPattern.Strategy.NormalStrategy;

public class NormalVehicle extends Vehicle{

    NormalVehicle(){
        super(new NormalStrategy());
    }
}
