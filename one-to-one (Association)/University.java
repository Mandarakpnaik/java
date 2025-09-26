class University
{
	public String universityName;
	public int noOfDepartments;
	public Departments department;
	
	public University(String universityName,int noOfDepartments,Departments department)
	{
		this.universityName=universityName;
		this.noOfDepartments=noOfDepartments;
		this.department=department;
	}
	public void displayUniversityDetails()
	{
		System.out.println("University name :"+universityName+ ", "+"Number of departments :"+noOfDepartments);
		System.out.println("Department Name :"+department.departmentName+ ","+ "Number of Student :"+department.noOfStudent);
	}
}