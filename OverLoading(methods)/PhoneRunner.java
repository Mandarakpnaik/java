class PhoneRunner
{
	public static void main(String [] ref)
	{
		Phone phone = new Phone();
		phone.phone(1500);
		phone.phone(1500,"Redmi 12");
		phone.phone(1500,"Redmi 12",9089756787l);
		phone.phone(1500,"Redmi 12",9089756787l,'R');
		phone.phone(1500,"Redmi 12",9089756787l,'R',120.456);
		phone.phone(1500,"Redmi 12",9089756787l,135.344,'R',5.3f);
		phone.phone(1500,"Redmi 12",9089756787l,135.344,'R',5.3f,true);
	}
}