class ClassRoom
{
	public void displayRoom(Teacher teacher)
	{
		Student student = new Student();
		teacher.displayTeacher(student);
		System.out.println("This is ClassRoom method");
		
	}
}