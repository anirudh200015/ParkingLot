package panels;

import commonClasses.ParkingLot;
import commonClasses.ParkingSpot;
import commonClasses.Vehicle;
import displayPanel.EntryDisplayPanel;
import parkingStrategy.ParkingStrategy;
import parkingTicket.ParkingTicket;

public class EntryPanel {

	private ParkingStrategy strategy;
	private final EntryDisplayPanel displayPanel;
	private int ticketCounter=0;
	
	
	public EntryPanel(ParkingStrategy strategy) {
		
		this.strategy = strategy;
		this.displayPanel = new EntryDisplayPanel();
	}
	
	public void changeStratergy(ParkingStrategy stratergy) {
		this.strategy=stratergy;
	}
	
	
	public ParkingTicket parkVehicle(Vehicle vehicle, ParkingLot parkingLot) { 
	
		ParkingSpot spot= strategy.findSpot(vehicle,parkingLot);
		ParkingTicket ticket= null;
		
		if(spot!=null) {
			spot.parkVehicle(vehicle);
			ticket= new ParkingTicket("Ticket-"+(++ticketCounter),vehicle,spot);
			parkingLot.issueTicket(ticket);
		}
	
	
	displayPanel.displayTicketIssued(ticket);
		
		return ticket;
	}
	
	
}
