public class HotelRoom {

    private int roomNumber;
    private String roomType;
	private int occupied;
	private double rate;

    public void setRoomNumber(int roomNumber)   //setter for room number
	{
		this.roomNumber = roomNumber;		
	}

    public void setRoomType(String roomType)    //setter for room type
	{
		this.roomType = roomType;	
	}

	public void setRate(int rate)  				 //setter for room rate
	{	
		this.rate = rate;		
	}

	public void setOccupied(int occupied)  				 //setter for room rate
	{	
		this.occupied = occupied;		
	}

	public double getRate()              		    //getter for room rate
	{
		return rate;
	}

    public int getRoomNumber()                  //getter for room number
	{
		return roomNumber;
	}

    public String getRoomType()                 //getter for room type
	{
		return roomType;
    }

	public int getOccupied()  				 //getter for room rate
	{	
		return occupied;		
	}

	public boolean isOccupied(int occupied)
	{
		if(occupied == 1){
			return false;
		}
		else {return true;}
	}
}
