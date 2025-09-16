class LibraryRunner
{
	public static void main(String [] ref)
	{
		Library library = new Library();
		Book name = new Book("The King",3.4f);
		Book bookName = new Book("The Bible",4.1f);
		Book rating = new Book("The Lord Of the Rings",4.0f);
		Book ratingOfTheBook = new Book("The Little Prince",4.6f);
		Book book = new Book("A Tale Pf Two cities",4.8f);
		
		Book[] nameOfTheBook = {name,bookName,rating,ratingOfTheBook,book};
		library.libraryDetails(nameOfTheBook);
	}
}