class Bike
{
public Bike(int cost)
{
	int price = cost;
	System.out.println("The bike cost is " +cost);
} 
public Bike(String name)
{
	String bikeName = name;
	System.out.println("The bike name is "+name);
}
public Bike(char grade)
{
	char bikeGrade = grade;
	System.out.println("the bike grade is "+grade);
}
public Bike(long number)
{
	long registrationNumber = number;
	System.out.println("The bike registration number is "+number);
}
public Bike(float mileage)
{
	float bikeMileage = mileage;
	System.out.println("The bike mileage is "+mileage);
}
public Bike(double enginePower)
{
	double power = enginePower;
	System.out.println("The bike engine Power is "+enginePower);
}
public Bike(boolean isElectric)
{
	boolean electric = isElectric;
	System.out.println("The bike is electric "+isElectric);
}
}