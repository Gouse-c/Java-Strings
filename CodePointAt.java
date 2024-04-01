import java.util.Scanner;
class CodePointAt
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		int res =str.codePointAt(6);
		System.out.println(res);
	}
}