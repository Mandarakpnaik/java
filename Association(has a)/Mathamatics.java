class Mathamatics
{
	public String teacherName;
	public double teacherSalary;
	public Sushma sushma;
	public Prasad prasad;
	public Kavya kavya;
	
	public Mathamatics(String teacherName,double salary,Sushma sushma,Prasad prasad,Kavya kavya)
	{
		this.teacherName=teacherName;
		this.teacherSalary=teacherSalary;
		this.sushma=sushma;
		this.prasad=prasad;
		this.kavya=kavya;
	}
	public void displayMathamaticsDeaties()
	{
		System.out.println("Subject teacher name :"+teacherName+ ","+ "Subject teacher salary :"+teacherSalary);
		System.out.println("Sushma id :"+sushma.id+ ","+ "Sushma phone number :"+sushma.phoneNumber);
		System.out.println("Prasad id :"+prasad.id+ ","+ "Prasad phoneNumber :"+prasad.phoneNumber);
		System.out.println("Kavya id :"+kavya.id+ ","+ "Kavya phone number :"+kavya.phoneNumber);
	}
}