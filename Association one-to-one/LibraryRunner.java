class LibraryRunner
{
	public static void main(String [] ref)
	{
		Book book = new Book(100,"The King");
		Library library = new Library(6,"Knowledge Hub",book);
		library.displayLibraryDetalies();
	}
}