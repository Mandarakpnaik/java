class TeacherRunner
{
	public static void main(String [] ref)
	{
		int[] age = {23,44,29,41,48};
		int[] teacher =Teacher.ageOfTeacher(age);
		
		for(int num=0;num<age.length;num++)
		{
			System.out.println(age[num]);
		}
		
		long[] phoneNumber ={6756756778l,7890678909l,6345312345l,9890987890l,7867543456l};
		long[] number=Teacher.tecaherPhoneNumber(phoneNumber);
		
		for(int phone=0;phone<phoneNumber.length;phone++)
		{
			System.out.println(phoneNumber[phone]);
		}
		double[] value = {456.75,675.87,8967.677,7777.988,8789.899};
		double[] teacherSalary =Teacher.salary(value);
		
		for(int num=0;num<value.length;num++)
		{
			System.out.println(value[num]);
		}
		char[] gender = {'M','M','F','M','F'};
		char[] charater = Teacher.genderOfTheTeacher(gender);
		
		for(int charaters=0;charaters<gender.length;charaters++)
		{
			System.out.println(gender[charaters]);
		}
		float[] numbers ={4.9f,4.4f,4.1f,5.6f,5.9f};
		float[] num =Teacher.heights(numbers);
		
		for(int teacherHeigths=0;teacherHeigths<numbers.length;teacherHeigths++)
		{
			System.out.println(numbers[teacherHeigths]);
			
		}
		boolean[] parmanent = {true,false,false,true,false};
		boolean[] word =Teacher.isPermanents(parmanent);
		
		for(int height=0;height<parmanent.length;height++)
		{
			System.out.println(parmanent[height]);
			
		}
		
		String[] name={"Arun","vikas","sushma","karna","vidya"};
		String[] teachers=Teacher.teacherName(name);
		
		for(int words=0;words<name.length;words++)
		{
			System.out.println(name[words]);
		}
	}
}