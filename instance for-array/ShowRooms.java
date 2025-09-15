class ShowRooms
{
	public void noOfBikes(Bikes[] bike)
	{
	 System.out.println(bike.length);

     for(int number = 0;number<bike.length;number++)
	 {
		 Bikes num=bike[number];
		 num.displayBikes();
	 }		 
	}
}