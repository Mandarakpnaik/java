class ShowRoom
{
	public String name;
	public int showRoomNumber;
	public Car number;
	
	public ShowRoom(String name,int showRoomNumber,Car number)
	{
		this.name=name;
		this.showRoomNumber=showRoomNumber;
		this.number=number;
	}
	public void displayShowRoomDetalies()
	{
		System.out.println("ShowRoom name :" +name+ ","+"ShowRoom number :"+showRoomNumber);
		System.out.println("Car price :"+number.price+ "," +"Car name :"+number.name);
	}
}