class Room
{
	public String occupantName;
	public int roomNumber;
	public boolean isOccupied;
	public double price;
	public float rating;
	public long roomId;
	public char roomType;
	

	public Room(String occupantName,int roomNumber,boolean isOccupied,double price,float rating,long roomId,char roomType)
	{
		this.rating=rating;
		this.roomNumber=roomNumber;
		this.price=price;
		this.isOccupied=isOccupied;
		this.occupantName=occupantName;
		this.roomType=roomType;
		this.roomId=roomId;
	}
	public void displayRoom()
	{
		System.out.println("Room number:"+roomNumber+ ","+ "Occuiped :"+isOccupied+ ","+ "price :"+price+ ","+ "Rating :"+rating);
		System.out.println("Room occupantName :"+occupantName+ ","+ "Room id :"+roomId+ ","+ "Room type :"+roomType);
	}
}