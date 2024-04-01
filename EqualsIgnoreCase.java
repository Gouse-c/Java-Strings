class EqualsIgnoreCase
{
	public static void main(String args[])
	{
		String str1 = new String("ABC");
		String str2 = new String("abc");
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Both data of the objects are equal ...");
		}
		else
		{
			System.out.println("Both data of the objects are not equal...");
		}
	}
}