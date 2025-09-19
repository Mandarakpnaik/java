class BuildingRunner
{
	public static void main(String [] ref)
	{
		Library library = new Library("",4.5f);
		Library number=new Library("",4.9f);
		Library name = new Library("",3.5f);
		
		Books book = new Books(459,true,library);
		Staff staff = new Staff("karna-Assistant",1589.566,name);
		Floors floor = new Floors("Second Floor",number);
		Section section = new Section(100,false,name);
		
		book.displayBooksDetalies();
		System.out.println("----------------------------------------------");
		staff.displayStaffDetalies();
		System.out.println("----------------------------------------------");
		floor.displayFloorsDetalies();
		System.out.println("----------------------------------------------");
		section.displaySectionDetalies();
		
	}
}
