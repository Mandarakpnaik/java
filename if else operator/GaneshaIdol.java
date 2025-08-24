class GaneshaIdol
{
	public static int price(String feet,int amount)
	{
		if(feet == "oneInch")
		{
			amount = 2000;
		}else if(amount == 1000)
		{
			System.out.println("yes we have the idol");
		}else
		{
			System.out.println("no we dont have idol");
			
		}
		return amount;
		
	}
	
	
	public static int amount(String feet,int price)
	{
		if(feet == "twoInch")
		{
			price = 3000;
		}else if(price == 3500)
		{
           System.out.println("yes we have  idol");
		}else
		{
			System.out.println("no we dont have idol");
		}
		return price;
		
	}	
		
	
	public static int idolAvailability(String name,int stock)
	{
		if(name == "ganesha")
		{
			stock = 20;
		}else if(stock == 10)
		{
			System.out.println("yes we have stock");
		}else
		{
			System.out.println("No we dont have any stock");
		}
		return stock;
	}
	
	
	public static int delivery(double time,int num)
	{
		if(time == 44.56)
		{
			num=5;
		}else if(num == 7)
		{
			System.out.println("yes we delivery number of idol ");
		}else
		{
			System.out.println("No we dont delivery idol");
		}
		return num;
	}
	
	public static int transport(String transport,int hours )
	{
		if(transport == "bike")
		{
			 hours = 2;
		}else if(hours == 3)
		{
			System.out.println("yes we transport ");
		}else
		{
			System.out.println("No we dont transport idol");
		}
		return hours;
	}
	
	public static int numberOfLigth(String color,int ligth )
	{
		if(color == "red")
		{
			 ligth = 6;
		}else if(ligth == 1)
		{
			System.out.println("yes we have ligth in Red color");
		}else
		{
			System.out.println("No we have ligth in Red color");
		}
		return ligth;
	}
	
	public static int numberOfIdol(String color,int idol )
	{
		if(color == "Gold")
		{
			 idol = 60;
		}else if(idol == 35)
		{
			System.out.println("yes we have idol");
		}else
		{
			System.out.println("No we have idol");
		}
		return idol;
	}
	public static int idolHeigth(String name,int heigth )
	{
		if(name== "smallGwori")
		{
			 heigth = 4;
		}else if(heigth == 2)
		{
			System.out.println("The small gwori size");
		}else
		{
			System.out.println("No we dont have small Gwori");
		}
		return heigth;
	}
	public static int idolTheme (String theme,int number)
	{
		if(theme == "traditional")
		{
			 number = 2;
		}else if(number == 11)
		{
			System.out.println("Traditional idol");
		}else
		{
			System.out.println("No it is unique");
		}
		return number;
	}
	public static int material(String name,int code)
	{
		if(name == "clay")
		{
			 code = 201;
		}else if(code == 200)
		{
			System.out.println("ganesha idol material code ");
		}else
		{
			System.out.println("No material code is there");
		}
		return code;
	}
	
	
     public static int color(String name,int code)
	{
		if(name == "white")
		{
			 code = 1;
		}else if(code == 2)
		{
			System.out.println("ganesha idol color code ");
		}else
		{
			System.out.println("No color code is there");
		}
		return code;
	}
	
	public static int discount(String name,int amount)
	{
		if(name == "smallGanesha")
		{
			 amount = 800;
		}else if(amount ==1000)
		{
			System.out.println("ganesha idol discount ");
		}else
		{
			System.out.println("There is no discount");
		}
		return amount;
	}
	public static int shipping(String place,int distance)
	{
		if(place == "bangolore")
		{
			 distance = 23;
		}else if(distance ==25)
		{
			System.out.println("GaneshaIdol shipping ");
		}else
		{
			System.out.println("No shipping");
		}
		return distance;
	}
   public static int idolTypes(String type,int code)
	{
		if(type == "sitting")
		{
			 code = 67;
		}else if(code ==68)
		{
			System.out.println("GaneshaIdol is sitting ");
		}else
		{
			System.out.println("ganesha idol standing");
		}
		return code;
	}
    public static int festival(String name,int month)
	{
		if(name == "Ganesha")
		{
			 month = 8;
		}else if(month == 9)
		{
			System.out.println("Ganesha festival in september");
		}else
		{
			System.out.println("ganesha festival in other month");
		}
		return month;
	}
       public static int payment(String name,int amount)
	{
		if(name == "UPI")
		{
			 amount = 10000;
		}else if(amount == 70000)
		{
			System.out.println("payment by UPI");
		}else
		{
			System.out.println("payment by cash");
		}
		return amount;
	}
	 public static int rating(String name,int rate)
	{
		if(name == "GaneshaIdol")
		{
			 rate = 3;
		}else if(rate == 5)
		{
			System.out.println("GaneshaIdol is need to impove the color");
		}else
		{
			System.out.println("Ganesha idol is good");
		}
		return rate;
	}
	public static int export(String name,int weight)
	{
		if(name == "idol")
		{
			 weight= 89;
		}else if(weight == 77)
		{
			System.out.println("GaneshaIdol weight");
		}else
		{
			System.out.println("Ganesha idol not too much weight");
		}
		return weight;
	}
	public static int customization(String type,int choice)
	{
		if(type == "unique")
		{
			 choice = 1;
		}else if(choice == 2)
		{
			System.out.println("GaneshaIdol customization");
		}else
		{
			System.out.println("Ganesha idol not customization ");
		}
		return choice;
	}
	public static int returnPolicy(String name,int days)
	{
		if(name == "Gwori")
		{
			 days = 1;
		}else if(days == 2)
		{
			System.out.println("Gwori idol return Policy is there for one day only");
		}else
		{
			System.out.println("there is no return Policy");
		}
		return days;
	}
	public static int packageNumber(String name,int number)
	{
		if(name == "Gwori")
		{
			 number = 90;
		}else if(number == 91)
		{
			System.out.println("Gwori idol package Number");
		}else
		{
			System.out.println("there is no package Number");
		}
		return number;
	}

	
	
	
	
	
}




