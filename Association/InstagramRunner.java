class InstagramRunner
{
	public static void main(String [] ref)
	{
		User user = new User(4.6f);
		Instagram instagram = new Instagram(user);
		System.out.println(instagram.rating);
	}
}