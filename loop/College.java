
class College
{
	public static void main(String [] num)
	{
		char autonomous = 'B';
		char hinduCollege = 'A';
		char scienceCollege = 'B';
		char artsCollege = 'A';
		
		char [] grade ={autonomous,hinduCollege,scienceCollege,artsCollege};
		System.out.println(grade[3]);
		
		char nursing = 'B';
		grade[1]=nursing;
		System.out.println(grade[1]);
		
		System.out.println("Grade of the college");
		for(int ranking=0; ranking<grade.length;ranking++)
		{
			char [] value = grade;
			System.out.println(value);
		}
	}
}