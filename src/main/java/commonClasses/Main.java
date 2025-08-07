package commonClasses;


import parkingFloor.ParkingFloor;
import parkingStrategy.NearestAvailableSpotStrategy;

public class Main {

	public static void main (String[] args) {
		
		ParkingLot parkingLot= new ParkingLot(new NearestAvailableSpotStrategy());
		
		ParkingFloor floor1= new ParkingFloor("F1");
		floor1.addSpot(new ParkingSpot("F1-S1",SpotType.SMALL));
		floor1.addSpot(new ParkingSpot("F1-S2",SpotType.LARGE));
		parkingLot.addFloor(floor1);
		
		ParkingFloor floor2 = new ParkingFloor("F2");
        floor2.addSpot(new ParkingSpot("F2-S1", SpotType.SMALL));
        parkingLot.addFloor(floor2);
        
        ParkingFloor floor3 = new ParkingFloor("F3");
        floor3.setUnderMaintenance(true);
        floor3.addSpot(new ParkingSpot("F3-S1", SpotType.MEDIUM));
        parkingLot.addFloor(floor3);
        
        for (ParkingFloor floor : parkingLot.getFloors()) {
            floor.showFloorDisplay();
        }
		
	}
}
