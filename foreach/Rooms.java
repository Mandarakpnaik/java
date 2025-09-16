class Rooms
{
	public int roomNumber ;
	public boolean isAvailable ;
	
	public Rooms(int number,boolean available)
	{
		roomNumber = number;
		isAvailable = available;
	}
	public void numberOfRooms()
	{
		System.out.println("Room number :" +roomNumber+" ,"+"Available :"+isAvailable);
	}
}