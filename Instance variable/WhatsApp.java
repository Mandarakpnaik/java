class WhatsApp
{
	public int totalUsers = 3000;
	public char logo = 'W';
	public long downloads = 45000000l;
	public float rating = 4.6f;
	public double size = 45.65;
	public boolean isFree = true;
	public String owner = "Meta";
	
	
	public void displayWhatsApp()
	{
		System.out.println("WhatsApp details :");
		System.out.println("Total users of whatsApp :"+totalUsers);
		System.out.println("Logo of whatsApp :"+logo);
		System.out.println("Number of downloads :"+downloads);
		System.out.println("Rating of whatsApp :"+rating);
		System.out.println("Size :"+size);
		System.out.println("The whatsApp is free :"+isFree);
		System.out.println("WhatsApp owner :"+owner);
		
	}
}