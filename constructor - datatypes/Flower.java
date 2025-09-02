class Flower
{
public Flower(int lifespan)
{
	System.out.println("The Flower lifespan is = "+lifespan);
}	
public Flower(String name,int lifespan)
{
	System.out.println("The flower name = "+name);
 
	System.out.println("The flower lifespan is = "+lifespan);
}
public Flower(int lifespan,String name,char category)
{
	System.out.println("The flower lifespan is = "+lifespan);
	
	System.out.println("The flower name = "+name);
	
	System.out.println("The flower category = "+category);
}
public Flower(boolean isMedicinal,float fragranceLevel,double price)
{
	System.out.println("The flower is medicinal = "+isMedicinal);
	
	System.out.println("The flower fragrance Level is = "+fragranceLevel);
	System.out.println("The flowers price = "+price);
}
public Flower(float height,double cost,boolean isPlastic,String name)
{
	
	System.out.println("The flower height is = "+height);
	System.out.println("The flower cost = "+cost);
	System.out.println("The flower is plastic = "+isPlastic);
	System.out.println("The flower name = "+name);
}
public Flower(char color,long idNumber,int lifespan,String name,boolean isCostly)
{
	System.out.println("The flower color is = "+color);
	System.out.println("The flower id Number is = "+idNumber);
	System.out.println("The flower lifespan is = "+lifespan);
	System.out.println("The flower  name = "+name);
	System.out.println("The flower is costly = "+isCostly);
	
}
public Flower(long idNumber,char color,float fragranceLevel,int lifespan,String name,boolean isPlastic)
{
	System.out.println("The flower id Number is = "+idNumber);
	System.out.println("The flower color is = "+color);
	System.out.println("The flower fragrance Level is = "+fragranceLevel);
	System.out.println("The flowers lifespan is = "+lifespan);
	System.out.println("The flowers name = "+name);
	System.out.println("The flower is plastic = "+isPlastic);
}
public Flower(double price,boolean isCostly,long idNumber,char color,float height,int lifespan,String name)
{
	System.out.println("The flower price = "+price);
	System.out.println("The flower is costly = "+isCostly);
	System.out.println("The flowers color is = "+color);
	System.out.println("The flower id number is = "+idNumber);
	System.out.println("The flower height is = "+height);
	System.out.println("The flower lifespan is = "+lifespan);
	System.out.println("The flower name = "+name);
	
}
}