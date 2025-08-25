class Universe
{
	public static void main(String [] ref)
	{
	String [] galaxyNames ={ "Milky Way","Andromedo","Sombrero","Whirlpool"};
	int [] numberOfPlanets = {6,7,3,8};
	byte [] galaxyId = {1,2,3,4};
	short [] starCounts = {1200,3456,655,754};
	long [] ligthYears = {35545l,2765432l,98765l,67890l};
	double [] distances = {4566.643,3457.765,6543.567,345.7654};
	char [] planetCodes = {'B','C','A','D'};
	boolean [] lifeExists = {true,false,false,true};
	float [] temperatures = {23.5f,66.6f,21.5f,19.56f};
	
	System.out.println("Galaxy names:");
	for(int name = 0;name<galaxyNames.length;name++)
	System.out.println(galaxyNames[name]);

    System.out.println("-----------------------------");
	 
	
	System.out.println("Number of planet:");
	for(int number=0;number<numberOfPlanets.length;number++)
		System.out.println(numberOfPlanets[number]);
	
	
    System.out.println("-----------------------------");
	
	System.out.println("Galaxy Ids:");
	for(int id=0;id<galaxyId.length;id++)
		System.out.println(galaxyId[id]);
	
	System.out.println("------------------------");
	
	System.out.println("Star counts:");
    for(int count =0;count<starCounts.length;count++)	
		System.out.println(starCounts[count]);
	
	System.out.println("------------------------");
	
	System.out.println("ligth Years :");
	for(int year=0;year<ligthYears.length;year++)
		System.out.println(ligthYears[year]);
	
	System.out.println("------------------------");
	
	 System.out.println("distances of planet:");
	 for(int value=0;value<distances.length;value++)
		 System.out.println(distances[value]);
	 
	 System.out.println("------------------------");
	 
	 System.out.println("planet Codes are :");
	 for(int code=0;code<planetCodes.length;code++)
		 System.out.println(planetCodes[code]);
	 
	 System.out.println("------------------------");
	 
	 System.out.println("life Exists:");
	 for(int life=0;life<lifeExists.length;life++)
		 System.out.println(lifeExists[life]);
	 
	 
	 System.out.println("-----------------------");
	 
	 System.out.println("temperatures in universe:");
	 for(int temp = 0;temp<temperatures.length;temp++)
		 System.out.println(temperatures[temp]);
	 
	}
}