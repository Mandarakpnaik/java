class MacBookRunner
{
	public static void main(String [] ref)
	{
		MacBook book = new MacBook();
		book.displayMacBook(45000);
		book.displayMacBook(45000,"MacBook pro M3");
		book.displayMacBook(45000,"MacBook pro M3",768987654345678l);
		book.displayMacBook(45000,"MacBook pro M3",768987654345678l,14.5f);
		book.displayMacBook(45000,"MacBook pro M3",768987654345678l,14.5f,3.348);
		book.displayMacBook(45000,"MacBook pro M3",768987654345678l,14.5f,3.348,'M');
		book.displayMacBook(45000,"MacBook pro M3",768987654345678l,14.5f,3.348,'M',true);
	}
}