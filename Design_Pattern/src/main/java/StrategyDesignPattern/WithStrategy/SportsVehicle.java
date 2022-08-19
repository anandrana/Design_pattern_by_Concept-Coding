package StrategyDesignPattern.WithStrategy;

import StrategyDesignPattern.WithStrategy.Strategy.SportDriveStrategy;

public class SportsVehicle extends Vehicle{

    public SportsVehicle(){
        super(new SportDriveStrategy());
    }
}
