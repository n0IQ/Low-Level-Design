import WithStrategyPattern.GoodsVehicle;
import WithStrategyPattern.OffRoadVehicle;
import WithStrategyPattern.PassengerVehicle;
import WithStrategyPattern.SportsVehicle;
import WithStrategyPattern.Vehicle;
import WithoutStrategyPattern.*;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
    }
}