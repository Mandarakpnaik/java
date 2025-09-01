class Actor
{
public Actor(int salary)
{
	int amount = salary;
	System.out.println("The Actor salary " +amount);
}
public Actor(float height)
{
	float feet = height;
	System.out.println("The Actor height is "+feet);
}
public Actor(long phone,String name)
{
	long number = phone;
	String actorName = name;
	System.out.println(number);
	System.out.println(name);
}
public Actor(double income)
{
	double value = income;
	System.out.println("Actor income is " +income);
}
public Actor(String name)
{
	String nameOfTheActor = name;
	System.out.println("The Actor name is "+name);
}
public Actor(boolean isGood)
{
	boolean good = isGood;
	System.out.println(good);
}
public Actor(char gender)
{
	char actorGender = gender;
	System.out.println(gender);
}
}