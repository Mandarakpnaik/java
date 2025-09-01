class Table
{
public Table(String name,int cost)
{
	String nameOfTable = name;
	int amount = cost;
	System.out.println("The name of the table is "+name);
	System.out.println("The cost of table is "+cost);
}
public Table(int amount)
{
	int price = amount;
	System.out.println("The Table price is "+amount);
	
}
public Table(long serialNumber)
{
	long number = serialNumber;
	System.out.println("serialNumber of the table "+number);
	
}
public Table(double area)
{
	double tableArea = area;
	System.out.println("The area of an table "+area);
	
}
public Table(float weight)
{
	float tableWeight = weight;
	System.out.println("The table weight "+weight);
}
public Table(char shape)
{
	char tableShape = shape;
	System.out.println("The table shape is " +shape);
}
public Table(boolean isWooden)
{
	boolean wooden = isWooden;
	System.out.println("the table is wooden "+wooden);
}
}