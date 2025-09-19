class Tea
{
	public int teaPrice;
	public String teaShopName;
	public Sugar sugar;
	
	public Tea(int teaPrice,String teaShopName,Sugar sugar)
	{
		this.teaPrice=teaPrice;
		this.teaShopName=teaShopName;
		this.sugar=sugar;
	}
	public void displayTeaDetalies()
	{
		System.out.println("Tea price :"+teaPrice+ ","+ "Tea shop name :"+teaShopName);
		System.out.println("Number of spoons :"+sugar.noOfSpoons+ "," +"Tea is sugar less :"+sugar.isSugarLess);
	}
}