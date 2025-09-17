class MobileRunner
{
	public static void main(String [] ref)
	{
		Charger charger = new Charger(true);
		Mobile mobile = new Mobile(charger);
		System.out.println(mobile.isGoodCondition);
	}
}