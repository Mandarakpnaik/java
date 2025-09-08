class KoreanDress
{
	public String name = "Hanbok";
	public int price = 3600;
	public long productId = 123432l;
	public float weight = 123.43f;
	public double totalSales = 3457.654;
	public char color = 'W';
	public boolean isTraditional = false;
	
	public void displayDress()
	{
		System.out.println("Korean Dress name :"+name);
		System.out.println("Dress price :"+price);
		System.out.println("Dress product Id :"+productId);
		System.out.println("Dress weight is :"+weight);
		System.out.println("Total sales :"+totalSales);
		System.out.println("Korean dress color is :"+color);
		System.out.println("The dress is Traditional :"+isTraditional);
	}
}