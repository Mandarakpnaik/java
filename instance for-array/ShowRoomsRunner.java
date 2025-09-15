class ShowRoomsRunner
{
	public static void main(String [] ref)
	{
		ShowRooms showRooms = new ShowRooms();
		Bikes name = new Bikes("KTM",true);
		Bikes value = new Bikes("Honda Activa",true);
		Bikes num = new Bikes("Royal Enfield",false);
		Bikes names = new Bikes(" BMW",true);
		Bikes number = new Bikes("Hero",false);
		
		Bikes [] bikes = {name,value,num,names,number};
		showRooms.noOfBikes(bikes);
	}
}