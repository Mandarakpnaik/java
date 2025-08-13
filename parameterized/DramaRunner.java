
class DramaRunner
{
	public static void main(String [] ref)
{
		int number = Drama.numberOfActs(35);
		System.out.println(number);
		
		String name = Drama.dramaName("comedy");
		System.out.println(name);
		
		float rating = Drama.audienceRating(3.2f);
		System.out.println(rating);
		
		double cost = Drama.dramaCost(3506.56);
		System.out.println(cost);
		
		char grade = Drama.dramaGrade('C');
		System.out.println(grade);
		
		boolean musical = Drama.isMusical(true);
		System.out.println(musical);
		
		long total = Drama.totalAudience(678904l);
		System.out.println(total);
}
}
