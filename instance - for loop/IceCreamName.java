class IceCreamName
{
	public String [] name ={"Vanilla","Chocolate","Strawberry","Mango","BlueBerry","Butterscotch"};
	public void displayName()
	{
		System.out.println(name.length);
		for(int value=0;value<name.length;value++)
		{
			System.out.println(name[value]);
		}
	}
}