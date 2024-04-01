class EqualT0ComparisonOperator
{
	public static void main(String args[])
	{
		String str1 = new String("ABC");
		String str2 = new String("ABC");
		if(str1==str2)
		{
			System.out.println("Both References are equal ...");
		}
		else
		{
			System.out.println("Both References are not equal...");
		}
	}
}