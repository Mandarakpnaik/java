class CityRunner
{
 public static void main(String[] args)
    {
        String[] names = {"Bengaluru", "Mumbai", "Delhi", "Chennai"};
		
        String[] cityNames = City.cityNames(names);
		
        for(int cities = 0; cities < names.length; cities++)
        {
            System.out.println(names[cities]);
        }

        int[] populations = {12000000, 20000000, 19000000, 10000000};
		
        int[] cityPopulations = City.populations(populations);
		
        for(int number= 0; number < populations.length; number++)
        {
            System.out.println(populations[number]);
        }

        long[] pinCodes = {560001L, 400001L, 110001L, 600001L};
		
        long[] cityPins = City.pinCodes(pinCodes);
		
        for(int code= 0; code< pinCodes.length; code++)
        {
            System.out.println(pinCodes[code]);
        }

        float[] literacyRates = {88.5f, 92.3f, 89.7f, 91.0f};
		
        float[] rates = City.literacyRates(literacyRates);
		
        for(int rating = 0; rating < literacyRates.length;rating++)
        {
            System.out.println(literacyRates[rating]);
        }

        double[] areas = {741.54345, 603.9876, 1484.3456, 426.677};
		
        double[] cityAreas = City.areas(areas);
		
        for(int value = 0; value < areas.length; value++)
        {
            System.out.println(areas[value]);
        }

        char[] grades = {'A', 'A', 'B', 'B'};
		
        char[] cityGrades = City.grades(grades);
		
        for(int grade = 0; grade < grades.length; grade++)
        {
            System.out.println(grades[grade]);
        }

        boolean[] metro = {true, true, true, true};
		
        boolean[] cityMetro = City.isMetro(metro);
		
        for(int metros= 0; metros< metro.length; metros++)
        {
            System.out.println(metro[metros]);
        }
    }
}