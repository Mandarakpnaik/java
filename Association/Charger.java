class Charger
{
	public boolean isGoodCondition;
	
	public Charger(boolean condition)
	{
		isGoodCondition=condition;
	}
	public void displayCharger()
	{
		System.out.println(isGoodCondition);
	}
}