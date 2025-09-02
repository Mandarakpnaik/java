class Letter
{
	public static int pages;
	public static long letterId;
	public static char grade;
	public static double weight;
	public static float thickness;
	public static boolean isStamped ;
	public static String sender;
	
	public static void letters()
	{
		System.out.println("Before init pages ="+pages);
		pages = 2;
		System.out.println("After init pages ="+pages);
		
		System.out.println("---------------------------");
		
		System.out.println("Before init letter Id ="+letterId);
		letterId = 675848l;
		System.out.println("After init letter Id ="+letterId);
		
		System.out.println("---------------------------");
		
		System.out.println("Before init grade of letter ="+grade);
		grade = 'B';
		System.out.println("After init grade of letter ="+grade);
		
		System.out.println("---------------------------");
		
		System.out.println("Before init weight of letter ="+weight);
		weight = 45.345;
		System.out.println("After init weight of letter ="+weight);
		
		System.out.println("---------------------------");
		
		System.out.println("Before init thickness of letter = "+thickness);
		thickness = 1.2f;
		System.out.println("After init thickness of letter = "+thickness);
		
		System.out.println("---------------------------");
		
		System.out.println("Before init is Stamped letter = "+isStamped);
		isStamped = true;
		System.out.println("After init is Stamped letter = "+isStamped);
		
		System.out.println("---------------------------");
		
		System.out.println("Before init sender letter = "+sender);
		sender = "Vidya";
		System.out.println("After init sender letter = "+sender);
		
		
	}
}