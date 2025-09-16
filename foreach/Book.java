class Book 
{
	public String bookname;
	public float bookRating;
	
	public Book(String bookname,float bookRating)
	{
		this.bookRating = bookRating;
		this.bookname = bookname;
	}
	public void bookDetails()
	{
		System.out.println("Book name :" +bookname+" , "+"Book Rating :"+bookRating);
	}
}