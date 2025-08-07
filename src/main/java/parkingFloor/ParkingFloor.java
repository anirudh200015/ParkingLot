package parkingFloor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import commonClasses.ParkingSpot;
import commonClasses.SpotType;
import commonClasses.Vehicle;
import displayPanel.EntryDisplayPanel;
import displayPanel.FloorDisplayPanel;

    



public class ParkingFloor {
	
	private final String floorid;
	private final Map<SpotType, Set<ParkingSpot> >spotMap;
	private boolean underMaintenance;
	private final  FloorDisplayPanel displayPanel;
	
	
	
	public ParkingFloor(String i) {
		
		this.floorid = i;
		this.spotMap = new HashMap<>();
		this.underMaintenance=false;
		displayPanel=new FloorDisplayPanel(i);
		
		
		for(SpotType type: SpotType.values()) {
			spotMap.put(type,new HashSet<>());
		
			
		}
		
	}
	
	public void addSpot(ParkingSpot spot) {
		
		spotMap.get(spot.getSpotType()).add(spot);
		
	}
	
	public ParkingSpot getAvailableSpot(Vehicle vehicle) {
		
		if(underMaintenance) {
			return null;
		}
		
		for(Map.Entry<SpotType,Set<ParkingSpot>>entry: spotMap.entrySet()) {
			
			for(ParkingSpot spot: entry.getValue()) {
				if(spot.canFitVehicle(vehicle)) {
					return spot;
				}
			}
		}
		
		return null;
		
	}
	
	
	
		public Set<ParkingSpot> getAllSpots(){
			
			Set<ParkingSpot> allSpots= new HashSet<>();
			for (Set<ParkingSpot> spot: spotMap.values()) {
				allSpots.addAll(spot);
			}
			
			
			return allSpots;
		}

		public boolean isUnderMaintenance() {
			return underMaintenance;
		}

		public void setUnderMaintenance(boolean underMaintenance) {
			this.underMaintenance = underMaintenance;
		}

		public String getFloorid() {
			return floorid;
		}

		public Map<SpotType, Set<ParkingSpot>> getSpotMap() {
			return spotMap;
		}

		public void showFloorDisplay() {
			// TODO Auto-generated method stub
			
		}
		
//		public void ShowFloorDisplay() {
//			DisplayPanel.displayAvailableSlots(spotMap,underMaintannce);
//		}
//		
		

	
	
	

}
