class SolarSystemRunner
{
	public static void main(String [] ref)
	{
		String name= SolarSystem.planetCount("earh",10);
		System.out.println(name);
		System.out.println("-------------------------");
		
		
		 String names  = SolarSystem.planetPosition(3,"Earth");
		System.out.println(names);
		System.out.println("-------------------------");
		
	   double temp = SolarSystem.planetTemperature(34567.987,2);
		System.out.println(temp);
		System.out.println("-------------------------");
		
		String planetName = SolarSystem.rings(6,"saturn");
		System.out.println(planetName);
		System.out.println("-------------------------");
		
		
		
		
		SolarSystem.system("neptun",8);
		System.out.println("-------------------------");
		
		int distence = SolarSystem.earth("green",993);
		System.out.println(distence);
		System.out.println("-------------------------");
		
		
		
		int size = SolarSystem.planetNames("marse",993);
		System.out.println(size);
	    System.out.println("--------------------------");
		
		double sizes = SolarSystem.smallPlante("mercury",74.8);
		System.out.println(sizes);
	    System.out.println("-----------------------------");
		

        int position = SolarSystem.planet("veens",2)	;
        System.out.println(position);
		System.out.println("-----------------------------");
		
		SolarSystem.moonSize("moon",1740);
		

		
		
	}
}