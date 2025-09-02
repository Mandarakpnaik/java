class House
{
	public House(String ownerName)
	{
		System.out.println("The house owner Name = "+ownerName);
	}
	public House(String name,int area)
	{
		System.out.println("The house Name = "+name);
		System.out.println("The house area in sq ft = "+area);
	}
	public House(String name,int area,double price)
	{
		System.out.println("The house Name = "+name);
		System.out.println("The house area in sq ft = "+area);
	    System.out.println("house price is ="+price);
	}
	public House(String name,int area,double price,boolean furnished)
	{
		System.out.println("The house Name = "+name);
		System.out.println("The house area in sq ft = "+area);
	    System.out.println("house price is ="+price);
		System.out.println("The house is furnished = "+furnished);
	}
	public House(String name,int area,double price,char grade,long regNumber)
	{
		System.out.println("The house Name = "+name);
		System.out.println("The house area in sq ft = "+area);
	    System.out.println("house price is ="+price);
		System.out.println("House grade is ="+grade);
		System.out.println("House regNumber is ="+regNumber);
		
	}
	public House(String name,int area,double price,boolean furnished,long regNumber,float height)
	{
		System.out.println("The house Name = "+name);
		System.out.println("The house area in sq ft = "+area);
	    System.out.println("house price is ="+price);
		System.out.println("The house is furnished = "+furnished);
		System.out.println("House regNumber is ="+regNumber);
		System.out.println("House height in meters ="+height);
	}
	public House(String name,int area,double price,boolean furnished,long regNumber,float height,char grade)
	{
		System.out.println("The house Name = "+name);
		System.out.println("The house area in sq ft = "+area);
	    System.out.println("house price is ="+price);
		System.out.println("The house is furnished = "+furnished);
		System.out.println("House regNumber is ="+regNumber);
		System.out.println("House height in meters ="+height);
		System.out.println("House grade is ="+grade);
		
	}
	public House(String name,int area,char grade,float height)
	{
		System.out.println("The house Name = "+name);
		System.out.println("The house area in sq ft = "+area);
		System.out.println("House height in meters ="+height);
		System.out.println("House grade is ="+grade);
		
	}
}