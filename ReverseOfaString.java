import java.util.Scanner;
class ReverseOfaString
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		String revStr2="";
		for(int i=str.length()-1;i>=0;i--)
		{
			revStr2=revStr2+str.charAt(i);
		}
		System.out.println("The reversed String is :"+revStr2);
	}
}