import java.util.Scanner;
class Length
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		int res=str.length();
		System.out.println("The length of the string is : "+ res);
	}
}