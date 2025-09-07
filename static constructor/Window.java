class Window
{
public static int height;
public static long serialNumber;
public static String frameMaterial;
public static boolean tinted;
public static double price;
public static float thickness;
public static char type;


public Window(int height,long serialNumber,String frameMaterial,boolean tinted,double price,float thickness,char type)
{
	System.out.println("Window height:"+this.height);
	System.out.println("Window serialNumber:"+this.serialNumber);
	System.out.println("Window frame material:"+this.frameMaterial);
    System.out.println("Window tinted:"+this.tinted);
    System.out.println("Window price:"+this.price);
	System.out.println("Window thickness:"+this.thickness);
    System.out.println("Window type Sliding:"+this.type);

    this.height = height;
	this.serialNumber = serialNumber;
	this.frameMaterial = frameMaterial;
	this.tinted = tinted;
	this.price = price;
	this.thickness = thickness;
	this.type = type;
	
	System.out.println("Window height:"+this.height);
	System.out.println("Window serialNumber:"+this.serialNumber);
	System.out.println("Window frame material:"+this.frameMaterial);
    System.out.println("Window tinted:"+this.tinted);
    System.out.println("Window price:"+this.price);
	System.out.println("Window thickness:"+this.thickness);
    System.out.println("Window type Sliding:"+this.type);

	
	
	
}
}