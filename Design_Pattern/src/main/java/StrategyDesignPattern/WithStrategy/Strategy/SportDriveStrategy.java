package StrategyDesignPattern.WithStrategy.Strategy;

public class SportDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("sports drive strategy");
    }
}
