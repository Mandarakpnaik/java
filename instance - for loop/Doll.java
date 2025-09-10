class Doll
{
	public float[] size = {2.2f,3.1f,4.1f};
	
	public void displaySize()
	{
		int sizes = size.length;
		System.out.println(size.length);
		
		
		for(int value=0;value<size.length;value++)
		{
			System.out.println(size[value]);
			
		}
	}
}