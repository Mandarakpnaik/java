class BuildingRunner 
{
    public static void main(String[] args) 
	{

	 Building building = new Building();
        Room[] rooms = new Room[10];
        rooms[0] = new Room("Karna",101, false,1000.34,4.2f,345677l,'A');
        rooms[1] = new Room("Pushpa",102, true,1200.34,3.1f,678902556l,'A');
        rooms[2] = new Room("Latha",103, false,1300.344,4.2f,7890033l,'C');
		rooms[3] = new Room("Mandara",104, false,1400.567,5.0f,1234567l,'A');
        rooms[4] = new Room("Prasad",105, true, 1500.345,4.3f,90876543345l,'C');
        rooms[5] = new Room("Arun",106, false,1709.45,4.2f,678911191l,'A');
		rooms[6] = new Room("Sushma",107,true,1200.345,4.4f,1234567890l,'C');
        rooms[7] = new Room("Harshitha",108,false,1000.234,3.3f,89087654325l,'A');
        rooms[8] = new Room("Navya",109,true,2500.345,4.0f,34567890l,'C');
        rooms[9] = new Room("Vikas",110,false,300.23,4.9f,789065788l,'A');
		
        System.out.println("----------------------");
		
		Floor[] floors = new Floor[5];
        floors[0] = new Floor(1, rooms);
        floors[1] = new Floor(2, rooms);
		floors[2] = new Floor(3, rooms);
        floors[3] = new Floor(4, rooms);
		floors[4] = new Floor(5, rooms);
        
 	    System.out.println("----------------------");
		
       
        building.displayBuilding(floors);
                    
    }
	
}