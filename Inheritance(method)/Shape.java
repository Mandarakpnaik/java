class Shape  
{
	public long area;
	public static boolean isRegular;
	
	public static void displayShape()
	{
		System.out.println("It is Regular "+isRegular);
		//System.out.println("Shape area "+area);
	}
	public void displayShapeDetalies()
	{
		System.out.println("Shape area "+area+ ","+ "It is Regular "+isRegular);
	}
	
}