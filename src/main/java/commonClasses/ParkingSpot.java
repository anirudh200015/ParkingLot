package commonClasses;

public class ParkingSpot {
	
	private final String id;
	private final SpotType spotType;
	private boolean isOccupied;
	private Vehicle parkedVehicle;   // vehicle will be null by default
	
	
	public ParkingSpot(String id, SpotType spotType) {
		
		this.id = id;
		this.spotType = spotType;
		this.isOccupied = false;
		
	}
	
	public boolean canFitVehicle(Vehicle vehicle)
	{	
		if(isOccupied) {
			return false;
		}
		
		
		return switch(vehicle.getType()) {
		
		case CAR-> spotType==SpotType.SMALL || spotType==SpotType.MEDIUM;
		case BUS,TRUCK ->spotType==SpotType.LARGE;
		};
	}
	
	public void parkVehicle(Vehicle vehicle) {
		
		this.parkedVehicle=vehicle;
		this.isOccupied=true;
	}
	
	public void removeVehicle() {
		this.parkedVehicle=null;
		this.isOccupied=false;
	}
	
	

	public boolean isOccupied() {
		return isOccupied;
	}

	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}

	public Vehicle getParkedVehicle() {
		return parkedVehicle;
	}

	public void setParkedVehicle(Vehicle parkedVehicle) {
		this.parkedVehicle = parkedVehicle;
	}

	public String getId() {
		return id;
	}

	public SpotType getSpotType() {
		return spotType;
	}
	
	
	
}
