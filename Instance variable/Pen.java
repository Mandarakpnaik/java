class Pen
{
 public int price = 25;
 public long serialNumber = 567483l;
 public float weigth = 12.3f;
 public double inkCapacity = 1.23;
 public char color = 'R';
 public boolean refillable = false;
 public String brand = "Reynolds";
 
 public void displayPen()
 {
	 System.out.println("Pen details ");
	 System.out.println("Pens Brand is : "+brand);
	 System.out.println("Pen price : "+price);
	 System.out.println("Pen weigth is :"+weigth);
	 System.out.println("Pens ink capacity is : "+inkCapacity);
	 System.out.println("Pen color is : "+color);
	 System.out.println("Pen is refillable : "+refillable);
	 System.out.println("Pen serial Number:"+serialNumber);
	 
 }
}