package displayPanel;

import commonClasses.Vehicle;

public class ExitDisplayPanel implements DisplayPanel{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display @Exit: Thank you! Drive safe.");
	}

	public void displayCost(Vehicle vehicle, double cost) {
		// TODO Auto-generated method stub
		System.out.println("Display @Exit: Vehicle " + vehicle.getLicenseNumber() + " - Total cost: ₹" + cost);
	}

}
