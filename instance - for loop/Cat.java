class Cat
{
	public char[] gender = {'M','F','F','M','M'};
	
	public void displayGender()
	{
		int len = gender.length;
		System.out.println(gender.length);
		
		for(int name=0;name<gender.length;name++)
		{
			System.out.println(gender[name]);
		}
	}
}