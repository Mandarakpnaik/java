class Book
{
	public Book(int year)
	{
		System.out.println("Book year is = "+year);
	}
	public Book(int year,String title)
	{
		System.out.println("Book year is = "+year);
		System.out.println("Book name is = "+title);
	}
	public Book(int year,String title,float rating)
	{
		System.out.println("Book year is = "+year);
		System.out.println("Book name is = "+title);
		System.out.println("The Book rating ="+rating);
	}
	public Book(int year,String title,char coverType,float rating)
	{
		System.out.println("Book year is = "+year);
		System.out.println("Book name is = "+title);
		System.out.println("Book cover type is ="+coverType);
		System.out.println("The Book rating ="+rating);
	}
	public Book(int year,String title,float rating,char coverType,double price)
	{
		System.out.println("Book year is = "+year);
		System.out.println("Book name is = "+title);
		System.out.println("Book cover type is ="+coverType);
		System.out.println("The Book rating ="+rating);
		System.out.println("The price of the book is ="+price);
	}
	public Book(boolean available,long isbnNumber,int year,String title,float rating,char coverType)
	{
		System.out.println("The book is available = "+available);
		System.out.println("The book ISBN number is = "+isbnNumber);
		System.out.println("Book year is = "+year);
		System.out.println("Book name is = "+title);
		System.out.println("Book cover type is ="+coverType);
		System.out.println("The Book rating ="+rating);
	}
	public Book(double price,boolean available,long isbnNumber,int year,String title,float rating,char coverType)
	{
		System.out.println("Book price is ="+price);
		System.out.println("The book is available = "+available);
		System.out.println("The book ISBN number is = "+isbnNumber);
		System.out.println("Book year is = "+year);
		System.out.println("Book name is = "+title);
		System.out.println("Book cover type is = "+coverType);
		System.out.println("The Book rating = "+rating);
	}
	public Book(double price,boolean available,long isbnNumber,int year,String title,float rating)
    {
		System.out.println("Book price is ="+price);
		System.out.println("The book is available = "+available);
		System.out.println("The book ISBN number is = "+isbnNumber);
		System.out.println("Book year is = "+year);
		System.out.println("Book name is = "+title);
		System.out.println("The Book rating = "+rating);
	}
	
	
	
	
}