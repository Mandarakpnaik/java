class Movies 
{
	public static void main(String [] num)
	{
		String punithRajkumar = "Akash";
		String alluArjun = "Pushpa";
		String ramCharan = "Naayak";
		String maheshBabu = "Maharshi";
		
		String [] name = {punithRajkumar, alluArjun, ramCharan, maheshBabu};
		System.out.println(name[0]);
		
		String sudeep = "Max";
		name[3]=sudeep;
		System.out.println(name[3]);
		 System.out.println("----------------");
		 
		
		System.out.println("Name of the Movies");
		for(int actor=0; actor<name.length;actor++)
			System.out.println(name[actor]);
		
	}
}