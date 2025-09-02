class Umbrella
{
	public Umbrella(String color,int length,long serialNumber,float weight,double price,char size,boolean waterproof)
	{
		System.out.println("Umbrella color = "+color);
		System.out.println("Umbrella length in cm = "+length);
		System.out.println("Umbrella unique serialNumber = "+serialNumber);
		System.out.println("weight of an umbrella = "+weight);
		System.out.println("price of an umbrella = "+price);
		System.out.println("umbrella sizes = "+size);
		System.out.println("the umbrella is waterproof="+waterproof);
	}
	public Umbrella(int length,long serialNumber,float weight,double price,char size,boolean waterproof)
	{
	
		System.out.println("Umbrella length in cm = "+length);
		System.out.println("Umbrella unique serialNumber = "+serialNumber);
		System.out.println("weight of an umbrella = "+weight);
		System.out.println("price of an umbrella= "+price);
		System.out.println("umbrella sizes = "+size);
		System.out.println("the umbrella is waterproof ="+waterproof);
	}
	public Umbrella(long serialNumber,float weight,double price,char size,boolean waterproof)
	{
	
		System.out.println("Umbrella unique serialNumber = "+serialNumber);
		System.out.println("weight of an umbrella = "+weight);
		System.out.println("price of an umbrella "+price);
		System.out.println("umbrella sizes = "+size);
		System.out.println("the umbrella is waterproof = "+waterproof);
	}
	public Umbrella(String color,boolean waterproof,float weight,int length)
	{
		System.out.println("weight of an umbrella = "+weight);
		System.out.println("the umbrella is waterproof ="+waterproof);
		System.out.println("Umbrella length in cm = "+length);
		System.out.println("Umbrella color = "+color);
	}
	public Umbrella(char size,String color,boolean waterproof)
	{
		System.out.println("Umbrella color = "+color);
		System.out.println("the umbrella is waterproof ="+waterproof);
		System.out.println("umbrella sizes = "+size);
		
		
	}
	public Umbrella(boolean waterproof,float weight)
	{
		System.out.println("the umbrella is waterproof ="+waterproof);
		System.out.println("weight of an umbrella = "+weight);
	}
	public Umbrella(float weight)
	{
		System.out.println("weight of an umbrella = "+weight);
	}
	public Umbrella(double price)
	{
		System.out.println("price of an umbrella = "+price);
	}
}