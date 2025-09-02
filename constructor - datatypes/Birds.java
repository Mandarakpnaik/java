class Birds
{
 public Birds(int age)
 {
    System.out.println(age);
 }
 public Birds(int age,String name)
 {
    System.out.println(age);
    System.out.println(name);
 }
 public Birds(int age,String name,boolean fly)
 {
    System.out.println(age);
    System.out.println(name);
    System.out.println(fly);
 }
 public Birds(int age,String name,boolean fly,long population)
 {
    System.out.println(age);
    System.out.println(name);
    System.out.println(fly);
    System.out.println(population);
 }
 public Birds(int age,String name,long population,char type,boolean fly)
 {
	System.out.println(age);
	System.out.println(name);
	System.out.println(population);
	System.out.println(type);
	System.out.println(fly);
	
 }
 public Birds(String name)
 {
    System.out.println(name);
 }
public Birds(String name,int age,long population,char type)
 {
	System.out.println(name);
	System.out.println(age);
	System.out.println(population);
	System.out.println(type);
 }
}