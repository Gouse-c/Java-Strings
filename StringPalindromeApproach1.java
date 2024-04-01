import java.util.Scanner;
class StringPalindromeApproach1
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		String rev=new StringBuffer(str).reverse().toString();
		if(str.equals(rev))
		{
			System.out.println("Both Strings are Palindrome");
		}
		else
		{
			System.out.println("Both Strings are not Palindrome");
		}
	}
}