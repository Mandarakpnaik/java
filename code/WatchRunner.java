class WatchRunner
{
    public static void main(String[] args)
    {
        String[] names = {"Rolex", "Titan", "Fossil", "Casio"};
        String[] watchNames = Watch.watchNames(names);
        for(int name = 0; name< names.length; name++)
        {
            System.out.println(names[name]);
        }

        int[] prices = {5000, 15000, 25000, 8000};
        int[] watchPrices = Watch.prices(prices);
        for(int num= 0; num< prices.length; num++)
        {
            System.out.println(prices[num]);
        }

        long[] serials = {9999999666666L, 2456789654567L, 39876433567L, 489776345676L};
        long[] watchSerials = Watch.serialNumbers(serials);
        for(int number = 0; number< serials.length; number++)
        {
            System.out.println(serials[number]);
        }

        float[] ratings = {4.5f, 4.2f, 4.8f, 3.9f};
        float[] watchRatings = Watch.ratings(ratings);
        for(int star = 0; star< ratings.length; star++)
        {
            System.out.println(ratings[star]);
        }

        double[] sizes = {348.5, 470.0, 402.5, 244.0};
        double[] watchSizes = Watch.dialSizes(sizes);
        for(int watch = 0; watch< sizes.length; watch++)
        {
            System.out.println(sizes[watch]);
        }

        char[] types = {'A', 'B', 'A', 'C'};
        char[] watchTypes = Watch.types(types);
        for(int type = 0; type< types.length; type++)
        {
            System.out.println(types[type]);
        }

        boolean[] smart = {true, false, true, false};
        boolean[] smartWatches = Watch.isSmartWatch(smart);
        for(int value = 0;value < smart.length; value++)
        {
            System.out.println(smart[value]);
        }
    }
}