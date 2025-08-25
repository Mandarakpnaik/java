class Gadgets
{
	public static String gadgetsType(double count,String name)
	{
		if( count == 456.66  || name =="SmartPhone" )
		{
			
			System.out.println("The type of gadgets  ");
			return name;
		}else
		{
		
			System.out.println("Incorrect gadgets");
			return name;
		}
		
	}
	public static int batteryCapacity(String name,int capacity)
	{
		if( name =="phone" || capacity ==4500)
		{
			
			System.out.println("The gadgets battery Capacity ");
			return capacity;
		}else
		{
		
			System.out.println("There no gadgets");
			return capacity;
		}
	}
	public static double screenSize(int value,double size)
	{
		if( value == 3500 || size == 66.3)
		{
			
			System.out.println("The gadgets screen Size ");
			return size;
		}else
		{
		
			System.out.println("There is no gadgets screen size");
			return size;
		}
	}
	public static char category(int value,char type)
	{
		if( value == 300 || type == 'V')
		{
			
			System.out.println("The gadgets category type ");
			return type;
		}else
		{
		
			System.out.println("There is no gadgets category type");
			return type;
		}
	}
	 public static long price(boolean isGood,long amount)
	{
		if( isGood == true || amount == 45000 )
		{
			
			System.out.println("The gadgets amount ");
			return amount;
		}else
		{
		
			System.out.println("The gadgets amount is less");
			return amount;
		}
	}
	public static char connectivity(String name,char connect)
	{
		if( name == "Phone" || connect == 'W')
		{
			
			System.out.println("The gadgets connected by WiFi");
			return connect;
		}else
		{
		
			System.out.println("The gadgets connected by Cable");
			return connect;
		}
	}
	public static int production(String name,int year)
	{
		if( name == "androidPhone" || year == 2023 )
		{
			
			System.out.println("The gadgets androidPhone production year");
			return year;
		}else
		{
		
			System.out.println("The gadgets androidPhone is good");
			return year;
		}
	}
	
	public static float processorSpeed(String name,float speed)
	{
		if( name == "watch" || speed == 2.3f )
		{
			
			System.out.println("The gadget watch speed");
			return speed;
		}else
		{
		
			System.out.println("The gadgets watch speed is good");
			return speed;
		}
	}
	public static String gadgets(int count,String name)
	{
		if( count == 10  || name =="smartPhone" )
		{
			
			System.out.println("The type of gadgets  ");
			return name;
		}else
		{
		
			System.out.println("Incorrect gadgets");
			return name;
		}
	
	}
	public static int ram(String name,int gb)
	{
		if( name == "Apple" || gb == 4)
		{
			
			System.out.println("The gadget ramGB  ");
			return gb;
		}else
		{
		
			System.out.println("No ramGB ");
			return gb;
		}
	
	}
	
	public static  String warranty( boolean hasWarranty,String name)
	{
		if( hasWarranty == true || name == "apple")
		{
			
			System.out.println("The gadget apple is has warranty ");
			return name;
		}else
		{
		
			System.out.println("No warranty");
			return name;
		}
	
	}
	public static float rating(String name,float rate)
	{
		if(name == "tab" || rate == 4.5f)
		{
			
			System.out.println("The gadget tab rating is good ");
			return rate;
		}else
		{
		
			System.out.println("not good");
			return rate;
		}
	
	}
	
	public static long gadgetPrice(boolean isGood,long price)
	{
		if( isGood == false || price == 4000 )
		{
			
			System.out.println("The gadgets price ");
			return price;
		}else
		{
		
			System.out.println("The gadgets price is less");
			return price;
		}
	}
	public static int camerCost(boolean isGood,int cost)
	{
		if( isGood == true || cost == 400089)
		{
			
			System.out.println("The gadgets camer cost is more ");
			return cost;
		}else
		{
		
			System.out.println("The gadgets camer cost is less");
			return cost;
		}
	}
	public static String name(int mp,String gadgetName)
	{
		if( gadgetName == "computer" || mp == 64)
		{
			
			System.out.println("The gadgets camer cost is more ");
			return gadgetName;
		}else
		{
		
			System.out.println("The gadgets camer cost is less");
			return gadgetName;
		}
	}
}