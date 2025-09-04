class BMTCRunner
{
	public static void main(String [] ref)
	{
		BMTC bus = new BMTC();
		bus.busNumber("KA-01-123");
		bus.route("majestic to yelahanka");
		bus.ticketPrice(50);
		bus.driverName("Ravi");
		bus.busType("AC bus");
		
		System.out.println("--------------------------");
		
		
		BMTC number = new BMTC();
		number.busNumber("KA-02-2345");
		number.route("majestic to vijayanagar");
		number.ticketPrice(20);
		number.driverName("Kumar");
		number.busType("Non-AC bus");
		
		System.out.println("--------------------------");
		
		BMTC value = new BMTC();
		value.busNumber("KA-01-1322");
		value.route("Vijayanagar to hampinagar");
		value.ticketPrice(38);
		value.driverName("Shiva");
		value.busType("normal bus");
		
		System.out.println("--------------------------");
		
		BMTC type = new BMTC();
		type.busNumber("KA-02-5464");
		type.route("yelahanka to nagavara");
		type.ticketPrice(35);
		type.driverName("krishna");
		type.busType("Non-Ac bus");
		
		System.out.println("--------------------------");
		
		BMTC price = new BMTC();
		price.busNumber("KA-01-9856");
		price.route("yelahanka to devanahalli");
		price.ticketPrice(40);
		price.driverName("Ram");
		price.busType("Non-AC");
	
	}
}