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
this("Sparrow",2,350.65,true,'M');
System.out.println("Bird name :"+name);
System.out.println("Bird wings :"+wings);
System.out.println("Bird can Fly :"+canFly);
System.out.println("Bird price :"+price);

}
public Birds(String name,int wings,double price,boolean canFly,char gender)
{
this("peacook",2,586.56,false,'F',34.45f);
System.out.println("Bird name :"+name);
System.out.println("Bird wings :"+wings);
System.out.println("Bird can Fly :"+canFly);
System.out.println("Bird price :"+price);
System.out.println("Bird gender :"+gender);
}
public Birds(String name,int wings,double price,boolean canFly,char gender,float speed)
{
this("peacook",2,234.54,true,'M',23.45f,76444l);
System.out.println("Bird name :"+name);
System.out.println("Bird wings :"+wings);
System.out.println("Bird can Fly :"+canFly);
System.out.println("Bird price :"+price);
System.out.println("Bird gender :"+gender);
System.out.println("Bird speed :"+speed);
}
public Birds(String name,int wings,double price,boolean canFly,char gender,float speed,long idNumber)
{
System.out.println("Bird name :"+name);
System.out.println("Bird wings :"+wings);
System.out.println("Bird can Fly :"+canFly);
System.out.println("Bird price :"+price);
System.out.println("Bird gender :"+gender);
System.out.println("Bird speed :"+speed);
System.out.println("Bird id number :"+idNumber);
}


}