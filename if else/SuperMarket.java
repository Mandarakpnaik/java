class SuperMarket
{
	public static void price(String itemName)
	{
		int amount =0;
		if(itemName == "rice")
		{
			amount = 150;
			System.out.println("In if condition");
		}else
		{
			amount = 180;
			System.out.println("in else condition");
		}
		System.out.println(amount);
	}
}