class ChickenBiryani
{
	public int price;
	public boolean isSpicy;
	public Salt salt;
	
	public ChickenBiryani(int price,boolean isSpicy,Salt salt)
	{
		this.price=price;
		this.salt=salt;
		this.isSpicy=isSpicy;
	}
	public void displayChickenBiryaniDetails()
	{
		System.out.println("Chicken Biryani price :"+price+ ","+ "Chicken Biryani is Spicy :"+isSpicy);
		System.out.println("Salt brand Name :"+salt.brandName+ "," +"Salt quantity :"+salt.quantity);
	}
}