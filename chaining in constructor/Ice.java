class Ice
{
public Ice()
{
this(100);
}
public Ice(int price)
{
this(80,"Amul");
System.out.println("The Ice constructor with price= "+price);
}
public Ice(int price,String iceCreamName)
{
this(50,"Arun",true);
System.out.println("In Ice class:"+price);
System.out.println("In Ice class:"+iceCreamName);

}
public Ice(int price,String iceCreamName, boolean isGood)
{
this("Arun",false);
System.out.println("iceCream price:"+price);
System.out.println("The iceCream Name:"+iceCreamName);
System.out.println("The iceCream is good:"+isGood);
}
public Ice(String iceCreamName,boolean isGood)
{
System.out.println("The iceCream is good");
}
}
