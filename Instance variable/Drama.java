class Drama
{
	public int duration = 60;
	public long audienceCount = 35000l;
	public float ticketPrice = 340.34f;
	public double collection = 567883.45;
	public char grade= 'U';
	public boolean isHit = true;
	public String title = "The Great Play";
	
	public void displayDrama()
	{
		System.out.println("The drama duration in minutes :"+duration);
		System.out.println("The audience Count :"+audienceCount);
        System.out.println("Ticket price is :"+ticketPrice);
        System.out.println("Total collection :"+collection);
		System.out.println("The drama grade :"+grade);
        System.out.println("The drama is hit :"+isHit);
        System.out.println("Drama Title is :"+title);
    }


}