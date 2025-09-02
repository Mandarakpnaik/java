class Van
{
	public Van(String name)
	{
	      System.out.println("Van name = "+name);	
	}
	public Van(String name,boolean isAc)
	{
		System.out.println("Van name = "+name);
		System.out.println("In van Ac availale ="+isAc);
	}
	public Van(int speed,float fuelCapacity,long regNumber)
	{
		System.out.println("Van maximum speed in km = "+speed);
		System.out.println("van registration number ="+regNumber);
		System.out.println("Fuel tank capacity = "+fuelCapacity);
	}
	public Van(String brand,long regNumber,int speed,float fuelCapacity)
	{
		System.out.println("Van brand name = " +brand);
		System.out.println("Van maximum speed in km = " +speed);
		System.out.println("van registration number =" +regNumber);
		System.out.println("Fuel tank capacity = " +fuelCapacity);
	}
	public Van(String brand,int speed,long regNumber,float fuelCapacity,double price)
	{
		System.out.println("Van brand name = " +brand);
		System.out.println("Van maximum speed in km = " +speed);
		System.out.println("van registration number =" +regNumber);
		System.out.println("Fuel tank capacity = " +fuelCapacity);
		System.out.println("price in rupees =" +price);
	}
	public Van(String brand,int speed,long regNumber,float fuelCapacity,double price,char fueltype)
    {
		System.out.println("Van brand name = "+brand);
		System.out.println("Van maximum speed in km = "+speed);
		System.out.println("van registration number ="+regNumber);
		System.out.println("Fuel tank capacity = "+fuelCapacity);
		System.out.println("price in rupees ="+price);
		System.out.println("fuel type = "+fueltype);
	}
	public Van(String brand,int speed,long regNumber,float fuelCapacity,double price,char fueltype,boolean isAc)
	{
		System.out.println("Van brand name = "+brand);
		System.out.println("Van maximum speed in km = "+speed);
		System.out.println("van registration number ="+regNumber);
		System.out.println("Fuel tank capacity = "+fuelCapacity);
		System.out.println("price in rupees ="+price);
		System.out.println("fuel type = "+fueltype);
		System.out.println("In van Ac availale ="+isAc);
		
	}
	
	
	
}