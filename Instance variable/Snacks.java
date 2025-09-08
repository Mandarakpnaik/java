class Snacks
{
	public int calories = 250;
	public float price = 28.7f;
	public char grade = 'A';
	public double totalSales = 4567.76;
	public long batchNumber = 12567890;
	public boolean isVeg = true;
	public String name = "Lays Chips";
	
	public void displaySnacks()
	{
		System.out.println("Name of the snacks :"+name);
		System.out.println("Price of an snacks :"+price);
		System.out.println("snacks grade :"+grade);
		System.out.println("snacks batch Number :"+batchNumber);
		System.out.println("snacks total sales :"+totalSales);
		System.out.println("snacks calories is :"+calories);
		System.out.println("snacks is veg :"+isVeg);
		
	}
}