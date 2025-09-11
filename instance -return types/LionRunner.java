class LionRunner
{
	public static void main(String [] ref)
	{
		Lion lion = new Lion();
		int age = lion.displayAge();
		System.out.println(age);
		long population=lion.displayPopulation();
		System.out.println(population);
		float speed = lion.displaySpeed();
		System.out.println(speed);
		double power = lion.displayPower();
		System.out.println(power);
		char gender = lion.displayGender();
		System.out.println(gender);
		boolean wild=lion.displayWild();
		System.out.println(wild);
		String name=lion.displayName();
		System.out.println(name);
	}
}