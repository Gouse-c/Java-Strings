import java.util.Scanner;
class StringPalindromeApproach2
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		String str2="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str2=str2+str.charAt(i);
		}
		if(str.equals(str2))
		{
			System.out.println("Both Strings are Palindrome");
		}
		else
		{
			System.out.println("Both Strings are not Palindrome");
		}
	}
}