class HolidaysRunner
{
public static void main(String [] ref)
{
	    int days = Holidays.numberOfDays(25);
		System.out.println(days);
		
		String place = Holidays.holidaysPlace("Delhi");
		System.out.println(place);
		
		float temperature = Holidays.temperatureInHolidays(37.5f);
		System.out.println(temperature);
		
		double budget = Holidays.travalBudget(56000.567);
		System.out.println(budget);
		
		char season= Holidays.season('S');
		System.out.println(season);
		
		boolean national = Holidays.isNational(true);
		System.out.println(national);
		
		long total = Holidays.totalTravelers(34567l);
		System.out.println(total);

}
}