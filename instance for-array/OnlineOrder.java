class OnlineOrder
{
	public void noOfOrder(Item[] item)
	{
		System.out.println(item.length);
		for(int number=0;number<item.length;number++)
		{
			Item value=item[number];
			value.qualityItem();
		}
	}
}