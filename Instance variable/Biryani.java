class Biryani
{
	public String type = "Chicken biryani";
	public int spiceLevel = 9;
	public char grade = 'A';
	public float price = 250.45f;
	public long orderId = 89765l;
	public double totalSales = 4567.644;
	public boolean isVeg = false;
	
	public void displayBiryani()
	{
		System.out.println("Name of the biryani :"+type);
		System.out.println("Biryani spice Level is :"+spiceLevel);
		System.out.println("Biryani grade :"+grade);
		System.out.println("Price of biryani :"+price);
		System.out.println("order Id :"+orderId);
		System.out.println("Total sales of biryani :"+totalSales);
		System.out.println("The biryani is veg :"+isVeg);
		
		
		
	}
}