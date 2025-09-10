class Apple
{
	public int[] price = {165,150,67,100,250,190};
	
	public void displayPrice()
	{
	  int length = price.length;
	  System.out.println(price.length);
	  
	  for(int value=0;value<price.length;value++)
	  {
		  System.out.println(price[value]);
	  }
	}
}