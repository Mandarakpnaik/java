class WatchRunner
{
public static void main(String [] ref)
{
Watch.time();
Watch watch = new Watch();
Clock clock = new Clock();
watch.times(clock);
}
}