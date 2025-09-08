class Bags
{
public Bags()
{
this(550);
}
public Bags(int price)
{
this(750,"Globus");
System.out.println("the Bags constructor with price="+price);
}
public Bags(int price,String bagsName)
{
this(2800,"Globus",true);
System.out.println("in Bags class:"+price);
System.out.println("in Bags class:"+bagsName);
}
public Bags(int price,String bagsName,boolean isGood)
{
System.out.println("in Bags class:"+price);
System.out.println("in Bags class:"+bagsName);
System.out.println("the Bags is good"+isGood);
}
}