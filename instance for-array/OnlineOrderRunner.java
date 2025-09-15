class OnlineOrderRunner
{
	public static void main(String [] ref)
	{
		OnlineOrder order = new OnlineOrder();
		Item name = new Item("SunSceen",true);
		Item value = new Item("Bed",false);
		Item num = new Item("Pillow",true);
		Item number = new  Item("Box",true);
		
		Item[] items = {name,value,num,number};
		order.noOfOrder(items);
	}
}