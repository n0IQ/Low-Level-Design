package WithStrategyPattern;

import WithStrategyPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
