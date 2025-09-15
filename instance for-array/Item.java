class Item
{
	public String itemName;
	public boolean isGoodQuality;
	
	public Item(String itemName,boolean isGoodQuality)
	{
		this.itemName = itemName;
		this.isGoodQuality = isGoodQuality;
	}
	public void qualityItem()
	{
		System.out.println("ItemName :"+itemName);
		System.out.println("Good quality :"+isGoodQuality);
	}
}