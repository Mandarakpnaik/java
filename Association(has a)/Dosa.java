class Dosa
{
	public String restaurantName;
	public int price;
	public Salt salt;
	
	public Dosa(String restaurantName,int price,Salt salt)
	{
		this.restaurantName=restaurantName;
		this.price=price;
		this.salt=salt;
	}
	public void displayDosaDetails()
	{
		System.out.println("Restaurant Name :"+restaurantName+ ","+ "Dosa price :"+price);
		System.out.println("Salt brand Name :"+salt.brandName+ "," +"Salt quantity :"+salt.quantity);
	}
}