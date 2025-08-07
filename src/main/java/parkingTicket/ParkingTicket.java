package parkingTicket;

import commonClasses.ParkingSpot;
import commonClasses.Vehicle;

public class ParkingTicket {

	private final  String ticketId;
	

	private final Vehicle vehicle;
	private final ParkingSpot spot;
	private final long EntryTime;
	
	public ParkingTicket(String ticketId, Vehicle vehicle, ParkingSpot spot) {
		
		this.ticketId = ticketId;
		this.vehicle = vehicle;
		this.spot = spot;
		EntryTime = System.currentTimeMillis();
	}

	public String getTicketId() {
		return ticketId;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public ParkingSpot getSpot() {
		return spot;
	}

	public long getEntryTime() {
		return EntryTime;
	}
	
	
}
