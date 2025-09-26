class Human
{
	public String name;
	public int age;
	public char gender;
	public Heart rate;
	public Human(String name,int age,char gender,Heart rate)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.rate=rate;
		
	}
	public void displayHumanDetails()
	{
		System.out.println("Human name :"+name+ ","+ "Age :"+age+ ","+ "Genger :"+gender);
		System.out.println("Human heart totalBeats perDay :"+rate.totalBeatsPerDay+ ","+ "Heart is Healthy :"+rate.isHealthy);
	}
}