class BookRunner
{
	public static void main(String [] ref)
	{
		Book book = new Book();
		book.displayBook("The art of Success");
		book.displayBook("Wings of Fire",200);
		book.displayBook("The art of Success",250,23456779l);
		book.displayBook("The art of Success",250,23456779l,4.3f);
		book.displayBook("The art of Success",250,23456779l,4.3f,4500.345);
		book.displayBook("Wing of Fire",250,23456779l,4.3f,4500.345,'A');
		book.displayBook("Wing of Fire",250,23456779l,4.3f,4500.345,'A',true);
	}
}