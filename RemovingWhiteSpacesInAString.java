import java.util.Scanner;
class RemovingWhiteSpacesInAString
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		System.out.println("Before removal of white spaces : "+str);
		String str1=str.replaceAll("\\s+","");
		System.out.println("Ater removal of white spaces : "+str1);
	}
}