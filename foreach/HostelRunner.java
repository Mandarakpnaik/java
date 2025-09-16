class HostelRunner
{
	public static void main(String [] ref)
	{
		Hostel hostel = new Hostel();
		Rooms noOfRooms = new Rooms(201,true);
		Rooms rooms = new Rooms(202,false);
		Rooms roomInHostel = new Rooms(203,false);
		Rooms place = new Rooms(204,true);
		Rooms [] roomDetails ={noOfRooms,rooms,roomInHostel,place};
		hostel.hostelDetails(roomDetails);
	}
}