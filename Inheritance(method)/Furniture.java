class Furniture
{
	public int price;
	public static float length;
	
	public static void displayFurniture()
	{
		System.out.println("Furniture length :"+length);
	}
	public void displayFurnitureDetails()
	{
		System.out.println("Furniture price :"+price+ ","+ "Furniture length :"+length);
	}
}