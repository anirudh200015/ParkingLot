package parkingStrategy;

import commonClasses.ParkingLot;
import commonClasses.ParkingSpot;
import commonClasses.Vehicle;

public interface ParkingStrategy {

	ParkingSpot findSpot(Vehicle vehicle,ParkingLot parkingLot);
}
