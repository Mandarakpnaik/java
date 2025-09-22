class KitchenRunner
{
	public static void main(String [] ref)
	{
		MixerGrinder grinder = new MixerGrinder(2300,"Preethi Zodiac");
		Jars jar =new Jars('S',2.4);
		Glass glass = new Glass(300,"Borosil");
		
		Kitchen kitchen = new Kitchen(true,50,grinder,jar,glass);
		kitchen.displayKitchenDetails();
	}
}