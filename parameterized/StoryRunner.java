class StoryRunner
{
	public static void main(String [] ref)
{
		int chapters = Story.chaptersInStory(5);
		System.out.println(chapters);
		
		String name = Story.storyName("The king");
		System.out.println(name);
		
		float review = Story.review(4.9f);
		System.out.println(review);
		
		double price= Story.price(568.90);
		System.out.println(price);
		
		char gender= Story.genderOfTheCharater('M');
		System.out.println(gender);
		
		boolean good = Story.isGoodStory(true);
		System.out.println(good);
		
		long total = Story.totalCopies(134568l);
		System.out.println(total);
}
}