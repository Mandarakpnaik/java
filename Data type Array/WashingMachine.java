class WashingMachine
{
	public static void main(String [] ref)
	{
	String[] brandNames={"LG","Samsung","Whirlpool"};
	int[] washPrograms ={1,2,3,4};
	long[] serialNumbers={1002123l,1234543l,234111l};
	float[] detergentUsage={10.3f,12.34f,9.5f};
	double[] energyConsumption={1.2,1.5,1.8};
	char[] modes={'Q','H','N'};
	boolean[] isWorking={true,false,true};
	
	System.out.println("Washing Machine brand Names ");
	for(int name=0;name<brandNames.length;name++)
	{
		System.out.println(brandNames[name]);
	}
	
	System.out.println("Washing Machine wash Programs ");
	for(int wash=0;wash<washPrograms.length;wash++)
	{
		System.out.println(washPrograms[wash]);
	}
	System.out.println("Washing Machine serialNumbers ");
	for(int number=0;number<serialNumbers.length;number++)
	{
		System.out.println(serialNumbers[number]);
	}
	
	
	System.out.println("Washing Machine detergentUsage");
	for(int usage=0;usage<detergentUsage.length;usage++)
	{
		System.out.println(detergentUsage[usage]);
	}
	
	System.out.println("Washing Machine energy Consumption");
	for(int energy=0;energy<energyConsumption.length;energy++)
	{
		System.out.println(energyConsumption[energy]);
	}
	
	System.out.println("Washing Machine modes");
	for(int mode=0;mode<modes.length;mode++)
	{
		System.out.println(modes[mode]);
	}
	
	System.out.println("Washing Machine is Working");
	for(int work=0;work<isWorking.length;work++)
		
	{
		System.out.println(isWorking[work]);
	}
	}
}