package bikeproject;

public class MountainBike extends Bike implements MountainParts{

	private String suspension, type;
	private int frameSize;
	
	public MountainBike()
	{
		this("Bull Horn", "Hardtail", "Maxxis", "dropper", 27, "RockShox XC32", "Pro", 19);
	}//end constructor
	
    public MountainBike(String handleBars, String frame, String tyres, String seatType, int numGears, 
    		            String suspension, String type, int frameSize) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.suspension = suspension;
		this.type = type;
		this.frameSize = frameSize;
	}//end constructor
    
	public String toString()
	{
		return "MountainBike";

		
	}//end method printDescription

	@Override
	public void setSuspension(String newValue) {

	}

	@Override
	public String getSuspension() {
		return null;
	}

	@Override
	public void setType(String newValue) {

	}

	@Override
	public String getType() {
		return null;
	}
}//end class MountainBike
