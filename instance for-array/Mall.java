class Mall
{
	public void noOfMalls(Shops[] shop)
	{
		System.out.println(shop.length);
		for(int value=0;value<shop.length;value++)
		{
			Shops number =shop[value];
			number.noOfShops();
		}
	}
}