class Theatre
{
	public String name = "PVR Cinemas";
	public int seatingCapacity = 1500;
	public long totalVisitor = 400000l;
	public float ticketPrice = 250.34f;
	public double revenue = 15006.45;
	public char category = 'G';
	public boolean is3DEnabled = true;
	
	public void displayTheatre()
	{
		System.out.println("Name of theatre :"+name);
		System.out.println("Seating capacity in theatre :"+seatingCapacity);
		System.out.println("Total Visitor in theatre :"+totalVisitor);
		System.out.println("Revenue of theatre :"+revenue);
		System.out.println("Ticket price :"+ticketPrice);
		System.out.println("Category :"+category);
		System.out.println("In theatre 3D enabled :"+is3DEnabled);
	}
}