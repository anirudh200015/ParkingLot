package parkingStrategy;

import commonClasses.ParkingLot;
import commonClasses.ParkingSpot;
import commonClasses.Vehicle;
import parkingFloor.ParkingFloor;

public class NearestAvailableSpotStrategy  implements ParkingStrategy{
	
	

	@Override
	public ParkingSpot findSpot(Vehicle vehicle, ParkingLot parkingLot) {
		
		for(ParkingFloor floor: parkingLot.getFloors()) {
			 if (floor.isUnderMaintenance()) continue;
		      ParkingSpot spot = floor.getAvailableSpot(vehicle);
		      if (spot != null) return spot;
		    }
		    return null;
		}
		

}
