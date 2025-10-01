class HouseRunner
{
	public static void main(String [] ref)
	{
		Rooms room = new Rooms(5,true);
		House house = new House("Happiness",45787.677,room);
		house.displayHouseDetailes();
	}
}