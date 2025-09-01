class GeometryBox
{
public GeometryBox(int price)
{
	int amount = price;
	System.out.println("The Geometry Box cost is " +price);
} 
public GeometryBox(String name)
{
	String geometryBoxName = name;
	System.out.println("The Geometry Box name is "+name);
}
public GeometryBox(char shape)
{
	char shapeOfBox= shape;
	System.out.println("the Geometry Box is "+shape);
}
public GeometryBox(long serialNumber)
{
	long number = serialNumber;
	System.out.println("The geometry Box serialNumber is "+number);
}
public GeometryBox(float weight)
{
	float boxWeight= weight;
	System.out.println("The box weight is "+weight);
}
public GeometryBox(double volume)
{
	double geometryBoxVolume = volume;
	System.out.println("The Geometry Box volume is "+volume);
}
public GeometryBox(boolean isMetal)
{
	boolean boxMetal = isMetal;
	System.out.println("The Geometry Box is metal "+isMetal);
}
}