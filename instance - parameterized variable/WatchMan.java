class WatchMan
{
	public void displayMan(Principal principal)
	{
		ClassRoom classRoom = new ClassRoom();
		principal.displayPrincipal(classRoom);
		System.out.println("This is WatchMan method");
	}
}