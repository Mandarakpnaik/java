class Birds
{
public Birds()
{
this("Sparrow");
}
public Birds(String name)
{
this(2,"peacook");
System.out.println("Bird name :"+name);
}
public Birds(int wings,String name)
{
this(true,567.67,2);
System.out.println("Birds wings :"+wings);
System.out.println("Bird name :"+name);
}
public Birds(boolean canFly,double price,int wings)
{
this("peacook",2,457.23,true);
System.out.println("Bird can Fly :"+canFly);
System.out.println("Bird price :"+price);
System.out.println("Bird wings :"+wings);
}
public Birds(String name,int wings,double price,boolean canFly)
{
System.out.println("Birds ");
}




}