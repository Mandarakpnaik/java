class PhoneRunner
{
	public static void main(String [] ref)
	{
		Charger charger = new Charger(450);
		Phone phone =new Phone("Redmi 12",15000,charger);
		phone.displayPhoneDetails();
	}
}