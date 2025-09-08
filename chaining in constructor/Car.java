class Car
{
public Car()
{
this("Maruti");
}
public Car(String brand)
{
this("Honda",90000);
System.out.println("Car brand :"+brand);	
}
public Car(String brand,int price)
{
this("Honda",890765,true);
System.out.println("Car price :"+price);
System.out.println("Car brand :"+brand);	
}
public Car(String brand,int price,boolean isNew)
{
this(190000,false,4.8f,"Maruti");
System.out.println("Car price :"+price);
System.out.println("Car brand :"+brand);
System.out.println("the car is new :"+isNew);
}
public Car(int price,boolean isNew,float rating,String brand)
{
System.out.println("Car price ");
}
}