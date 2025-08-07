package panels;



import displayPanel.ExitDisplayPanel;
import parkingTicket.ParkingTicket;
import paymentProcessor.paymentProcessor;

public class ExitPanel  {

	private final ExitDisplayPanel displayPanel;
	private final paymentProcessor _paymentProcessor ;
	
	
	public ExitPanel( paymentProcessor _paymentProcessor) {
		
		this.displayPanel = new ExitDisplayPanel();
		this._paymentProcessor = _paymentProcessor;
	}
	
	 public void unparkVehicle(ParkingTicket ticket) {
	        if (ticket == null || ticket.getSpot() == null) return;

	        long duration = (System.currentTimeMillis() - ticket.getEntryTime()) / 1000; // seconds
	        double cost = 50.0 + duration * 0.1; // base rate
	        ticket.getSpot().removeVehicle();

	        _paymentProcessor.processPayment(cost);
	        displayPanel.displayCost(ticket.getVehicle(), cost);
	    }
	
	
}
