class Eagle extends Bird
{
	public static void displayEagle()
	{
		canFly=true;
		//color="";
		System.out.println(canFly);
		displayBird();
	}
	public void displayEagleDetailes()
	{
		canFly=true;
		color="Brown";
		System.out.println(canFly);
		System.out.println(color);
		//displayBird();
	}
}