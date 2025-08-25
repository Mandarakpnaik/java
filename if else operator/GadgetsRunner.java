class GadgetsRunner
{
	public static void main(String [] ref)
	{
		String name= Gadgets.gadgetsType(456.66,"SmartPhone");
		System.out.println(name);
		System.out.println("-------------------------");
		
		int value= Gadgets.batteryCapacity("battery",4500);
		System.out.println(value);
		System.out.println("-------------------------");
		
		double size  = Gadgets.screenSize(35,44.7);
		System.out.println(size);
		System.out.println("------------------------");
		
		char type = Gadgets.category(300,'V');
		System.out.println(type);
		System.out.println("--------------------------");
		
		long amount = Gadgets.price(true,45000l);
        System.out.println(amount);
		System.out.println("-----------------------");
		
		char connect = Gadgets.connectivity("Phone",'W');
		System.out.println(connect);
		System.out.println("--------------------");
		
		
		int year = Gadgets.production("android",2022);
		System.out.println(year);
		System.out.println("------------------");
		
		float speed = Gadgets.processorSpeed("watch",2.3f);
		System.out.println(speed);
        System.out.println("------------------");
		
		String names= Gadgets.gadgets(4,"laptop");
		System.out.println(names);
		System.out.println("-------------------------");
		
		int gb = Gadgets.ram("apple",4);
		System.out.println(gb);
		System.out.println("---------------------");
		
		String nam = Gadgets.warranty(true, "apple");
		System.out.println(nam);
		System.out.println("--------------------");
		
		float rate = Gadgets.rating("tab",4.5f);
		System.out.println(rate);
		System.out.println("--------------------");
		
		long price = Gadgets.gadgetPrice(false,4000);
		System.out.println(price);
		System.out.println("--------------");
		
		int cost = Gadgets.camerCost(true,455);
		System.out.println(cost);
		System.out.println("-------------------");
		
		String gadgetName = Gadgets.name(64,"computer");
		System.out.println(gadgetName);
		
	}
}