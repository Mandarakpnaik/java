class Books
{
	public int noOfBooks;
	public boolean isAvialable;
	public Library library;
	
	public Books(int noOfBooks,boolean isAvialable,Library library)
	{
		this.noOfBooks=noOfBooks;
		this.isAvialable=isAvialable;
		this.library=library;
		
	}
	public void displayBooksDetalies()
	{
		System.out.println("Number of books :"+noOfBooks+ ","+ "Books isAvialable :"+isAvialable);
		System.out.println("Library name :"+library.libraryName+ ","+ "library rating :"+library.libraryRating);
	}
}