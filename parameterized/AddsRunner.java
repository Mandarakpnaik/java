class AddsRunner
{
	public static void main(String [] ref)
{
		int seconds = Adds.duration(35);
		System.out.println(seconds);
		
		String name = Adds.addsName("sales");
		System.out.println(name);
		
		float rating = Adds.viewerRating(3.2f);
		System.out.println(rating);
		
		double cost = Adds.addsCost(3506.56);
		System.out.println(cost);
		
		char grade = Adds.addsGrade('C');
		System.out.println(grade);
		
		boolean televised = Adds.isTelevised(true);
		System.out.println(televised);
		
		long total = Adds.totalViewers(678904l);
		System.out.println(total);
}
}