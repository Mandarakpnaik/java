class LibraryRunner
{
public static void main(String [] ref)
{
	int id =Library.libraryId();
	
	System.out.println(id);
	
	int cost = Library.bookCost();
	System.out.println(cost);
	
	int number = Library.bookNumber();
	System.out.println(number);
	
	int section = Library.numberOfSection();
	System.out.println(section);
	
	int chair = Library.numberOfChair();
	System.out.println(chair);

	
}

}