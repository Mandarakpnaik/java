class Pencil
{
public Pencil()
{

this(30);
}
public Pencil(int price)
{

this(50,"apsara");
System.out.println("the total price="+price);
}
public Pencil(int price,String name)
{

this(15,"apsara",8994667l);
System.out.println("the total price="+price);
System.out.println("the pencil name="+name);
}
public Pencil(int price,String name,long pencilSerialNumber)
{

this(25,"apsara",56767l,7456.8f);
System.out.println("the total price="+price);
System.out.println("the pencil name="+name);
System.out.println("the pencilSerialNumber="+pencilSerialNumber);
}
public Pencil(int price,String name,long pencilSerialNumber,float discount)
{

this(100,"apsara",4353564l,50.0f,'P');
System.out.println("the total price="+price);
System.out.println("the pen name="+name);
System.out.println("the pencilSerialNumber="+pencilSerialNumber);
System.out.println("the total discount="+discount);
}
public Pencil(int price,String name,long pencilSerialNumber,float discount,char pencilGrade)
{

this(16,"apsara",5464667l,20.0f,'C',false);
System.out.println("the total price="+price);
System.out.println("the pencil name="+name);
System.out.println("the pencilSerialNumber="+pencilSerialNumber);
System.out.println("the total discount="+discount);
System.out.println("the pencilGrade="+pencilGrade);
}
public Pencil(int price,String name,long pencilSerialNumber,float discount,char pencilGrade,boolean isAvailable)
{

this(10,"apsara",554648l,40.0f,'C',true,100.78);
System.out.println("the total price="+price);
System.out.println("the pencil name="+name);
System.out.println("the pencilSerialNumber="+pencilSerialNumber);
System.out.println("the total discount="+discount);
System.out.println("the pencilGrade="+pencilGrade);
System.out.println("is Available="+isAvailable);
}

public Pencil(int price,String name,long pencilSerialNumber,float discount,char pencilGrade,boolean isAvailable,double totalAmount)
{
System.out.println("the total price="+price);
System.out.println("the pencil name="+name);
System.out.println("the pencilSerialNumber="+pencilSerialNumber);
System.out.println("the total discount="+discount);
System.out.println("the pencilGrade="+pencilGrade);
System.out.println("is Available="+isAvailable);
System.out.println("the total amount="+totalAmount);
}
}
