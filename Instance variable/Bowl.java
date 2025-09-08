class Bowl
{
	
	public int price = 400;
	public long productId = 5678876l;
	public float weight = 850.43f;
	public char grade = 'B';
	public boolean microwaveSafe = true;
	public String material = "Ceramic";
	public double capacity = 78899.654;
	
	public void displayBowl()
	{
		
		System.out.println("Bowl price :"+price);
		System.out.println("Bowl product Id :"+productId);
		System.out.println("weight of bowl :"+weight);
		System.out.println("capacity of bowl :"+capacity);
		System.out.println("Bowl grade :"+grade);
		System.out.println("The bowl is microwave Safe :"+microwaveSafe);
		System.out.println("bowl material :"+material);

	}
}