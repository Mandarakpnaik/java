class Hostel
{
public static String name;
public static int capacity;
public static long regNumber;
public static float area;
public static double fees;
public static char grade;
public static boolean messAvailable;

public Hostel(String name,int capacity,long regNumber,float area,double fees,char grade,boolean messAvailable)
{
	this.name = name;
	this.capacity = capacity;
	this.regNumber = regNumber;
	this.area = area;
	this.fees  = fees;
    this.grade = grade;
    this.messAvailable = messAvailable;

    System.out.println("Name of hostel:"+this.name);
	System.out.println("Capacity in Hostel:"+this.capacity);
	System.out.println("Registration number of hostel:"+regNumber);
	System.out.println("Area of hostel:"+area);
	System.out.println("Annual fees :"+fees);
	System.out.println("Grade of hostel:"+grade);
	System.out.println("In hostel mess Available:"+messAvailable);
	
}
}