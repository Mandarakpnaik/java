class Ball
{
	public String [] name = {"Baskeball","Baseball","Volleyball","Rugby"};
	
	public void displayName()
	{
		int length = name.length;
		System.out.println(name.length);
		
		for(int value=0;value<name.length;value++)
		{
			System.out.println(name[value]);
		}
	}
}