class PollutionRunner
{
  public static void main(String [] ref)
    {
	 int level = Pollution.pollutionLevel();
	 System.out.println(level);
	 System.out.println("-------------------");
	 
	 char grade = Pollution.pollutionGrade();
	 System.out.println(grade);
	 System.out.println("--------------------");
	 
	 
	 byte index = Pollution.airIndex();
	 System.out.println(index);
	 System.out.println("-----------------");
	 
	 float percent =Pollution.pollutionPercentage();
	 System.out.println(percent);
	 System.out.println("-----------------");
	 
	 double emission = Pollution.emission();
	 System.out.println(emission);
	 System.out.println("-----------------");
	 
	 short indexs = Pollution.waterIndex();
	 System.out.println(indexs);
	 System.out.println("-----------------");
	 
	 long id = Pollution.pollutionId();
	 System.out.println(id);
	 System.out.println("-----------------");
	 
	 boolean high = Pollution.isNoiseHigh();
	 System.out.println(high);
	 System.out.println("-----------------");
	 
	 String type  = Pollution.pollutionType();
	 System.out.println(type);
	 
	 
	 
    }
}