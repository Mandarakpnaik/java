class CelebritiesRunner
{
	public static void main(String [] ref)
{
		int age = Celebrities.age(48);
		System.out.println(age);
		
		String name = Celebrities.name("Allu Arjun");
		System.out.println(name);
		
		float rating = Celebrities.popularityRating(4.8f);
		System.out.println(rating);
		
		double worth= Celebrities.netWorth(98753.345);
		System.out.println(worth);
		
		char gender = Celebrities.gender('M');
		System.out.println(gender);
		
		boolean winner= Celebrities.isAwardWinner(true);
		System.out.println(winner);
		
		long total = Celebrities.totalfollowers(5679433l);
		System.out.println(total);
}
}
