class Airplane
{
	public static void main(String[] regs)
	{
	String[] airlineNames={"air India","IndiGo","SpiceJet"};
	int[] flightNumber={101,302,790};
	long[] registrationIds={8976567987l,78998765l,1234587l};
	float[] fuelCapaities={60.22f,50.23f,70.22f};
	double[] maxAltitudes={35000.34,410001.12,78987.23};
	char[] categories={'P','C','M'};
	boolean[] isActive={true,false,false};
	
	
	System.out.println("Airplane names");
	for(int name=0;name<airlineNames.length;name++)
	{
		System.out.println(airlineNames[name]);
	}
	
	System.out.println("Airplane number ");
	
	for(int number=0;number<flightNumber.length;number++)
	{
		System.out.println(flightNumber[number]);
	}
	
	 System.out.println("Airplane Registration Ids");
	 for(int id=0;id<registrationIds.length;id++)
	 {
		 System.out.println(registrationIds[id]);
	 }
	 
	 System.out.println("Airplane fuel Capaities");
	 for(int fuel=0;fuel<fuelCapaities.length;fuel++)
	 {
		 System.out.println(fuelCapaities[fuel]);
	 }
	 
	 System.out.println("Airplane max Altitudes");
	 for(int max=0;max<maxAltitudes.length;max++)
	 {
		 System.out.println(maxAltitudes[max]);
	 }
	 
	 System.out.println("Ariplane categories");
	 
	 for(int active=0;active<isActive.length;active++)
	 {
		 System.out.println(isActive[active]);
	 }
	}
}