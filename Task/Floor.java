class Floor 
 {
	
   public int roomNumber;
    public Room[] rooms;

    public Floor(int roomNumber, Room[] rooms) 
	{
        this.roomNumber = roomNumber;
        this.rooms = rooms;
    }

    public void displayFloor() 
	{
        System.out.println(" Floor " + roomNumber);

        for (Room room : rooms)
		{
            room.displayRoom();
        }
    }
}