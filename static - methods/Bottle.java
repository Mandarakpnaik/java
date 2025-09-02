class Bottle
{
	public static int capacity;
	public static char grade;
	public static String brand;
	public static long price;
	public static float weight;
	public static double volume;
	public static boolean isReusable ;
	
	
public static void bottleName()
{
	System.out.println("Before init capacity ="+capacity);
	capacity = 1000;
	System.out.println("After init capacity = "+capacity);
	
	System.out.println("--------------------------------");
	
	System.out.println("Before init grade of bottle = "+grade);
	grade = 'B';
	System.out.println("After init grade of bottle = "+grade);
	
	System.out.println("--------------------------------");
	
	System.out.println("Before init bottle brand = "+brand);
	brand = "Milton";
	System.out.println("After init bottle brand = "+brand);
	
	System.out.println("--------------------------------");
	
	System.out.println("Before init bottle price = "+price);
	price = 2345l;
	System.out.println("After init bottle price = "+price);
	
	System.out.println("--------------------------------");
	
	System.out.println("Before init bottle weight ="+weight);
	weight = 23.4f;
	System.out.println("After init bottle weight ="+weight);
	
	System.out.println("-----------------------------------");
	
	System.out.println("Before init bottle volume ="+volume);
	volume = 1.234;
	System.out.println("After init bottle volume ="+volume);
	
	System.out.println("-------------------------------------");
	
	System.out.println("Before init bottle is reusable ="+isReusable);
	isReusable = false;
	System.out.println("After init bottle is reusable ="+isReusable);
	
	
	
	
}
}