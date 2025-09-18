class Library
{
	public int noOfSection;
	public String name;
	public Book sections;
	
	public Library(int noOfSection,String name,Book sections)
	{
		this.noOfSection=noOfSection;
		this.name=name;
		this.sections=sections;
	}
	public void displayLibraryDetalies()
	{
		System.out.println("Number of section :" +noOfSection+ ","+"Name :"+name);
		System.out.println("Name of the book :" +sections.nameOfTheBook+ ","+"Number Of Pages :"+sections.noOfPages);
	}
}