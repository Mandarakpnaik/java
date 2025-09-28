class Animal
{
public Animal()
{
	this(5);
	System.out.println("This is Animal class");
	
}
public Animal(int age)
{
	this(3,"Dog");
	System.out.println("Animal age :"+age);
	
}
public Animal(int age,String name)
{
	this(7,"Cat",177544l);
	System.out.println("Animal age :"+age);
	System.out.println("Animal name :"+name);
}
public Animal(int age,String name,long idNumber)
{
	this(12,"Tiger",23456l,60.5f);
	System.out.println("Animal age :"+age);
	System.out.println("Animal name :"+name);
	System.out.println("Animal unique Id :"+idNumber);
}
public Animal(int age,String name,long idNumber,float speed)
{
	this(10,"Lion",98654l,65.7f,50000.655);
	System.out.println("Animal age :"+age);
	System.out.println("Animal name :"+name);
	System.out.println("Animal unique Id :"+idNumber);
	System.out.println("Animal running speed :"+speed);
	
}
public Animal(int age,String name,long idNumber,float speed,double price)
{
    this(8,"Elephant",4567l,30.5f,89064.46,'M');
	System.out.println("Animal age :"+age);
	System.out.println("Animal name :"+name);
	System.out.println("Animal unique Id :"+idNumber);
	System.out.println("Animal running speed :"+speed);
	System.out.println("Animal price :"+price);
}
public Animal(int age,String name,long idNumber,float speed,double price,char gender)
{
	this(2,"Dog",56743l,56.4f,3456.65,'F',false);
	System.out.println("Animal age :"+age);
	System.out.println("Animal name :"+name);
	System.out.println("Animal unique Id :"+idNumber);
	System.out.println("Animal running speed :"+speed);
	System.out.println("Animal price :"+price);
	System.out.println("Animal gender :"+gender);
}
public Animal(int age,String name,long idNumber,float speed,double price,char gender,boolean wild)
{
	System.out.println("Animal age :"+age);
	System.out.println("Animal name :"+name);
	System.out.println("Animal unique Id :"+idNumber);
	System.out.println("Animal running speed :"+speed);
	System.out.println("Animal price :"+price);
	System.out.println("Animal gender :"+gender);
	System.out.println("Animal is wild :"+wild);
}
}