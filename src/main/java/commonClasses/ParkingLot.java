package commonClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import displayPanel.EntryDisplayPanel;
import displayPanel.ExitDisplayPanel;
import panels.EntryPanel;
import panels.ExitPanel;
import parkingFloor.ParkingFloor;
import parkingStrategy.ParkingStrategy;
import parkingTicket.ParkingTicket;
import paymentProcessor.CardPaymentProcessor;

public class ParkingLot {

	private final List<ParkingFloor> parkingFloors;
	
	private final EntryPanel entryPanel;
	private final ExitPanel  exitPanel;
	
	
	private final Map<String, ParkingTicket> activeTickets= new HashMap<>();


	public ParkingLot(ParkingStrategy stratergy) {
		
		this.parkingFloors = new ArrayList<>();
		this.entryPanel = new EntryPanel(stratergy);
		this.exitPanel = new ExitPanel( new CardPaymentProcessor());
		
		
		
	}
	
	public List<ParkingFloor> getFloors() {
        return parkingFloors;
    }
	
	public void addFloor(ParkingFloor floor) {
		
		parkingFloors.add(floor);
	}

	public EntryPanel getEntryPanel() {
		return entryPanel;
	}

	public ExitPanel getExitPanel() {
		return exitPanel;
	}
	
	public void changeStratergy(ParkingStrategy stratergy){
		entryPanel.changeStratergy(stratergy);
	}
	
	public void issueTicket(ParkingTicket ticket) {
		activeTickets.put(ticket.getTicketId(), ticket);
	}
	public ParkingTicket getTicket(String ticketId) {
		return activeTickets.get(ticketId);
	}
	
}
