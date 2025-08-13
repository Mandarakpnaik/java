class FestivalRunner
{
	public static void main(String [] ref)
{
		int days = Festival.numberOfDays(7);
		System.out.println(days);
		
		String name = Festival.festivalName("Ganesha");
		System.out.println(name);
		
		float rating = Festival.festivalRating(4.7f);
		System.out.println(rating);
		
		double budget = Festival.festivalBudget(4578.892);
		System.out.println(budget);
		
		char grade = Festival.festivalGrade('A');
		System.out.println(grade);
		
		boolean good = Festival.isGood(true);
		System.out.println(good);
		
		long number = Festival.numberOfPeople(23456l);
		System.out.println(number);
}
}