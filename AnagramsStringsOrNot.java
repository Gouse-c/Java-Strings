import java.util.Scanner;
import java.util.Arrays;
class AnagramsStringsOrNot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1 : ");
		String str1=sc.nextLine();
		System.out.println("Enter the String2 : ");
		String str2=sc.nextLine();
		String str3=str1.toLowerCase();
		String str4=str2.toLowerCase();
		if(str3.length()!=str4.length())
		{
			System.out.println("Both Strings are not Anagrams...");
		}
		else
		{
			char str5[]=str3.toCharArray();
			char str6[]=str4.toCharArray();
			
			Arrays.sort(str5);
			Arrays.sort(str6);
			
			if(Arrays.equals(str5,str6)==true)
			{
				System.out.println("Both Strings are Anagrams...");
			}
			else
			{
				System.out.println("Both Strings are not Anagrams...");
			}
		}
	}
}