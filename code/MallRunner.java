class MallRunner
{
	public static void main(String[] ref)
    {
        String[] names = {"Phoenix Mall", "Orion Mall", "Mantri Square", "Forum Mall"};
        String[] mallNames = Mall.mallNames(names);
        for(int name = 0; name< names.length; name++)
        {
            System.out.println(names[name]);
        }

        int[] years = {2007, 2012, 2015, 2018};
        int[] mallYears = Mall.establishedYears(years);
        for(int mall = 0; mall< years.length; mall++)
        {
            System.out.println(years[mall]);
        }

        long[] contacts = {9876543210L, 8765432109L, 7654321098L, 6543210987L};
        long[] mallContacts = Mall.contactNumbers(contacts);
        for(int number = 0; number < contacts.length; number++)
        {
            System.out.println(contacts[number]);
        }

        double[] cost = {125.75, 300.50, 450.00, 600.25};
        double[] mallTotal = Mall.totalCost(cost);
        for(int total = 0; total<cost.length; total++)
        {
            System.out.println(cost[total]);
        }

        float[] sizes = {150000.5f, 200000.0f, 175000.75f, 220000.25f};
        float[] mallSizes = Mall.areaSizes(sizes);
        for(int size = 0; size< sizes.length; size++)
        {
            System.out.println(sizes[size]);
        }

        char[] grades = {'A', 'B', 'A', 'C'};
        char[] mallGrades = Mall.mallGrades(grades);
        for(int charater = 0; charater< grades.length; charater++)
        {
            System.out.println(grades[charater]);
        }

        boolean[] cinema = {true, false, true, true};
        boolean[] mallCinema = Mall.hasCinema(cinema);
        for(int value = 0; value < cinema.length; value++)
        {
            System.out.println(cinema[value]);
        }
    }
}
