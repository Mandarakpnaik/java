class Principal
{
	public void displayPrincipal(ClassRoom classRoom)
	{
		Teacher teacher = new Teacher();
		classRoom.displayRoom(teacher);
		System.out.println("this is Principal method");
	}
	
}