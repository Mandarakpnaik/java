class DestinationRunner
{
	public static void main(String [] ref)
{
		int number = Destination.distance(300);
		System.out.println(number);
		
		String name = Destination.destinationName("Hills");
		System.out.println(name);
		
		float rating = Destination.touristRating(4.7f);
		System.out.println(rating);
		
		double cost = Destination.travalCost(60000.00);
		System.out.println(cost);
		
		char code = Destination.locationCode('H');
		System.out.println(code);
		
		boolean international= Destination.isInternational(false);
		System.out.println(international);
		
		long annual = Destination.annualVisitors(90875l);
		System.out.println(annual);
}
}
