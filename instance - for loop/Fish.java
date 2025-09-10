class Fish
{
	public double [] weight = {10.2,12.5,23.6,34.33};
	
	public void displayWeight()
	{
		int weights = weight.length;
		System.out.println(weight.length);
		for(int fish=0;fish<weight.length;fish++)
		{
			System.out.println(weight[fish]);
		}
	}
}