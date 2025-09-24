class Triangle extends Shape
{
	public static void displayTriangle()
	{
		isRegular=false;
		//area=45723l;
		System.out.println(isRegular);
		displayShape();
	}
	public void displayTriangleDetilas()
	{
		isRegular = true;
		area=768900l;
		System.out.println(isRegular+ ","+area);
		displayShape();
		displayShapeDetalies();
	}
}