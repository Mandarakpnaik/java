class TrafficRunner
{
public static void main(String [] ref)
{
	    int signals = Traffic.numberOfSignals(60);
		System.out.println(signals);
		
		String name = Traffic.cityName("mysuru");
		System.out.println(name);
		
		float rating = Traffic.accidentRating(2.3f);
		System.out.println(rating);
		
		double average = Traffic.averageMinutes(345.7);
		System.out.println(average);
		
		char code = Traffic.zoneCode('V');		
		System.out.println(code);
		
		boolean smart =Traffic.hasSmartSignal(true);
		System.out.println(smart);
		
		long vehicles = Traffic.vehiclesPerDay(500377l);
		System.out.println(vehicles);

}
}