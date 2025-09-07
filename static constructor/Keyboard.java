class Keyboard
{
public static String brand;
public static int numberOfKeys;
public static boolean backLight;
public static long serialNumber;
public static char type;
public static double price;
public static float weight;

public Keyboard(String brand,int numberOfKeys,boolean backLight,long serialNumber,char type,double price,float weight)
{
	this.brand = brand;
	this.numberOfKeys = numberOfKeys;
	this.backLight = backLight;
	this.serialNumber = serialNumber;
	this.type = type;
	this.price = price;
	this.weight = weight;
	
	System.out.println("Keyboard brand:"+this.brand);
	System.out.println("Number of keys in Keyboard:"+this.numberOfKeys);
	System.out.println("Keyboard as backLight:"+this.backLight);
	System.out.println("serialNumber of Keyboard:"+this.serialNumber);
	System.out.println("Keyboard type is wireless:"+this.type);
	System.out.println("Keyboard price is:"+this.price);
	System.out.println("Keyboard weight is:"+this.weight);
	
}
}