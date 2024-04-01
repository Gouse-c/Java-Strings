import java.util.Scanner;
class VowelsConsonantsOfAString
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		int vCount=0;
		int cCount=0;
		String str1=str.toLowerCase();
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)=='a' || str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u')
			{
				vCount++;
			}
			else if(str1.charAt(i)>='a' && str1.charAt(i)<='z')
			{
				cCount++;
			}
		}
		System.out.println("The vowel count is : "+vCount);
		System.out.println("The consonant count is : "+cCount);
	}
}