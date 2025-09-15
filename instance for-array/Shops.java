class Shops
{
	public int shopNumber ;
	public String shopName;
	
	public Shops(int shopNumber,String shopName)
	{
	this.shopName=shopName;
	this.shopNumber=shopNumber;
	}
	public void noOfShops()
	{
		System.out.println("Name :"+shopName);
		System.out.println("Number :"+shopNumber);
	}
}