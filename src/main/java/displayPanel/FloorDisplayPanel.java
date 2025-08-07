package displayPanel;

public class FloorDisplayPanel implements DisplayPanel {
	
	private final String floorId;

	public FloorDisplayPanel(String floorId) {
		
		this.floorId = floorId;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		 System.out.println("Display @Floor " + floorId + ": Welcome to Floor " + floorId);
	}
	
	

}
