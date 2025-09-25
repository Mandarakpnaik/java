class Doctor extends Person
{
	public String name;
	public int age;
	public char gender;
	public double salary;
	public float weight;
	public boolean isMarried;
	public long phoneNumber;
	public Doctor()
	{
		
		System.out.println("Doctor class no-argument const");
	}
	
	public Doctor(String name,int age,char gender,double salary,float weight,boolean isMarried,long phoneNumber)
	{ 
	    this();
	    
	    this.name=name;
		this.age=age;
		this.gender=gender;
		this.salary=salary;
		this.weight=weight;
		this.isMarried=isMarried;
		this.phoneNumber=phoneNumber;
		personName=name;
		personAge=age;
		personGender=gender;
		personSalary=salary;
		personWeight=weight;
		personIsMarried=isMarried;
	    personPhoneNumber=phoneNumber;

	}
	public void displayDoctorDetails()
	{
		System.out.println("Doctor name : "+this.name);
		System.out.println(super.personName);
		System.out.println("Doctor age :" +this.age);
		System.out.println(super.personAge);
		System.out.println("Doctor gender : "+this.gender);
		System.out.println(super.personGender);
		System.out.println("Doctor salary :" +this.salary);
		System.out.println(super.personSalary);
		System.out.println("Doctor weight :"+this.weight);
		System.out.println(super.personWeight);
		System.out.println("Doctor is Married :"+this.isMarried);
		System.out.println(super.personIsMarried);
		System.out.println("Doctor phone number :"+this.phoneNumber);
		System.out.println(super.personPhoneNumber);
		
	}
}