class Plate
{
public Plate(String name)
{
	String material = name;
	System.out.println(name);
}
public Plate(int cost)
{
	int amount = cost;
	System.out.println(amount);
	
}
public Plate(char colorCode)
{
	char color = colorCode;
	System.out.println(color);
}
public Plate(long serialNumber)
{
	long number = serialNumber;
	System.out.println(number);
	
}
public Plate(double area)
{ 
	double plateArea = area;
	System.out.println(area);
}
public Plate(boolean isSteel)
{
	boolean steel = isSteel;
	System.out.println(isSteel);
}
public Plate(float weight)
{
	float plateWeight = weight;
	System.out.println(weight);
}
}