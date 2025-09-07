class Notebook
{
public static String brand;
public static int height;
public static boolean ruled;
public static long serialNumber;
public static char type;
public static double price;
public static float weight;


public Notebook(String brand,int height,boolean ruled,long serialNumber,char type,double price,float weight)
{
	this.brand = brand;
	this.height = height;
	this.ruled = ruled;
	this.serialNumber = serialNumber;
	this.type = type;
	this.price = price;
	this.weight = weight;
	
	System.out.println("Name of notebook :"+this.brand);
	System.out.println("Height of mm:"+this.height);
	System.out.println("if pages are ruled:"+this.ruled);
	System.out.println("unique serial Number:"+this.serialNumber);
	System.out.println("Notebook type Spiral:"+this.type);
	System.out.println("Notebook price:"+this.price);
	System.out.println("Notebook weight:"+this.weight);
}
}