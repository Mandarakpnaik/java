class BedsRunner
{
	public static void main(String[] ref)
	{
		boolean[] wooden = {true, true, false, true};
        boolean[] bedWooden = Beds.isWooden(wooden);
        for(int beds = 0; beds< wooden.length; beds++)
        {
            System.out.println(wooden[beds]);
        }
		double[] prices = {4978.99, 89349.50, 12949.75, 1967.00};
        double[] bedPrices = Beds.prices(prices);
        for(int value= 0; value< prices.length; value++)
        {
            System.out.println(prices[value]);
        }

        float[] weights = {50.5f, 65.7f, 78.9f, 95.2f};
        float[] bedWeights = Beds.bedWeights(weights);
        for(int weight= 0; weight< weights.length; weight++)
        {
            System.out.println(weights[weight]);
        }

        char[] grades = {'A', 'B', 'A', 'C'};
        char[] bedGrades = Beds.qualityGrades(grades);
        for(int charater= 0; charater< grades.length; charater++)
        {
            System.out.println(grades[charater]);
        }
		String[] types = {"Single", "Double", "Queen", "King"};
        String[] bedTypes = Beds.bedTypes(types);
        for(int name = 0; name < types.length; name++)
        {
            System.out.println(types[name]);
        }

        int[] sizes = {90, 120, 150, 180};
        int[] bedSizes = Beds.sizes(sizes);
        for(int  size= 0; size< sizes.length;size++)
        {
            System.out.println(sizes[size]);
        }

        long[] serials = {1111111111L, 2222222222L, 3333333333L, 4444444444L};
        long[] bedSerials = Beds.serialNumbers(serials);
        for(int number = 0; number < serials.length; number++)
        {
            System.out.println(serials[number]);
        }
	}
}