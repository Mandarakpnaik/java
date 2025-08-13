class HouseRunner
{
public static void main(String [] ref)
{
	int  number = House.houseNumber();
	
	System.out.println(number);
	
	int cost = House.houseCost();
	System.out.println(cost);
	
	int rooms = House.totalRooms();
	System.out.println(rooms);
	
	int doors =House.numberOfDoors ();
	System.out.println(doors);
	
	int rent = House.rent();
	System.out.println(rent);

	
}

}