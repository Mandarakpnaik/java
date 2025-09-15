class School
{
	public void schoolDetailes(Staff[] staff)
	{
		System.out.println(staff.length);
		for(int value =0;value<staff.length;value++)
		{
			Staff number = staff[value];
			number.numberOfStaff();
		}
	}
}