class Chair extends Furniture
{
	public void displayChair()
	{
		price=250;
		length=1.23f;
		System.out.println(price+ ","+length);
		displayFurniture();
		displayFurnitureDetails();
	}
	public static void displayChairDetails()
	{
		length=2.3f;
		System.out.println(length);
		displayFurniture();
	}
}