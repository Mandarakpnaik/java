class Laptop
{
public static int id;
public static String name;
public static long serialNumber;
public static float rating;
public static double price;
public static boolean isGood;
public static char grade;

public Laptop(int id,String name,long serialNumber,float rating,double price,boolean isGood,char grade)
{
	System.out.println("Id of Laptop:"+this.id);
	System.out.println("Name of laptop:"+this.name);
	System.out.println("serialNumber of laptop:"+this.serialNumber);
	System.out.println("Rating of laptop:"+this.rating);
	System.out.println("Laptop price:"+this.price);
	System.out.println("The laptop is good:"+this.isGood);
	System.out.println("Laptop grade"+this.grade);
	
	this.id = id;
	this.name = name;
	this.serialNumber = serialNumber;
	this.rating = rating;
	this.price = price;
	this.isGood = isGood;
	this.grade = grade;
	
	System.out.println("Id of Laptop:"+this.id);
	System.out.println("Name of laptop:"+this.name);
	System.out.println("serialNumber of laptop:"+this.serialNumber);
	System.out.println("Rating of laptop:"+this.rating);
	System.out.println("Laptop price:"+this.price);
	System.out.println("The laptop is good:"+this.isGood);
	System.out.println("Laptop grade"+this.grade);
	
	
}
}