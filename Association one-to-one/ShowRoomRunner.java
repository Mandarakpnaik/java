class ShowRoomRunner
{
	public static void main(String [] ref)
	{
		Car car = new Car(45678.677,"Honda");
		ShowRoom showRoom = new ShowRoom("Velocity Motors",25,car);
		showRoom.displayShowRoomDetalies();
	}
}