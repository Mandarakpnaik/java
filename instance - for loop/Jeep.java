class Jeep
{
	public double[] price ={35785.56,45630.67,12345.32,67732.33,98726.23};
	public void displayJeep()
	{
		System.out.println(price.length);
		for(int value=0;value<price.length;value++)
		{
			System.out.println(price[value]);
		}
	}
}