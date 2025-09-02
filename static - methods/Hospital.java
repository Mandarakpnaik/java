class Hospital
{
	public static String name;
	public static int doctor;
	public static long hospitalId;
	public static char grade;
	public static double income;
	public static float area;
	public static boolean isGovernment;
	
	
	public static void hospitals()
	{
		System.out.println("Before Hospital name = "+name);
		name = "Green valley hospital";
		System.out.println("After Hospital name = "+name);
		
		System.out.println("---------------------------");
		
		System.out.println("Before doctor in hospital = "+doctor);
		doctor = 55;
		System.out.println("After doctor in hospital = "+doctor);
		
		System.out.println("---------------------------");
		
		System.out.println("Before hospital id is = "+hospitalId);
		hospitalId = 897543123l;
		System.out.println("After hospital id is = "+hospitalId);
		
		System.out.println("---------------------------");
		
		System.out.println("Before hospital grade is ="+grade);
		grade = 'B';
		System.out.println("After hospital grade is ="+grade);
		
		System.out.println("---------------------------");
		
		System.out.println("Before hospital income =" +income);
		income = 3000000.45;
		System.out.println("After hospital income =" +income);
		
		System.out.println("---------------------------");
		
		System.out.println("Before hospital area =" +area);
		area = 145.4f;
		System.out.println("After hospital area =" +area);
		
		System.out.println("---------------------------");
		
		System.out.println("Before hospital is Government =" +isGovernment);
		isGovernment = true;
		System.out.println("After hospital is Government =" +isGovernment);
		
		
		
	}
	
}