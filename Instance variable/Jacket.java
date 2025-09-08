class Jacket
{
	public String brand = "Woodland";
	public int price = 6600;
	public long productId = 988765l;
	public float weight = 850.43f;
	public double totalSales = 78899.654;
	public char color = 'B';
	public boolean isWaterproof = true;
	
	public void displayJacket()
	{
		System.out.println("Jacket brand :"+brand);
		System.out.println("Jacket price :"+price);
		System.out.println("Jacket product Id :"+productId);
		System.out.println("Jacket weight is :"+weight);
		System.out.println("Total sales of jackets :"+totalSales);
		System.out.println("Jacket color is :"+color);
		System.out.println("The jackets is waterproof :"+isWaterproof);

	}
}
