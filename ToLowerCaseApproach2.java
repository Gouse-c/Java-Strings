import java.util.Scanner;
class ToLowerCaseApproach2
{
	public static void main(String args[])
	{
		char res[]=toLowerCase();
		System.out.println("The Resulted String is :");
		System.out.println(res);
	}
	public static char[] toLowerCase()
	{
		String str="RAJARAMMOHANROY";
		str=str.concat("\0");
		char arr[]=str.toCharArray();
		int i=0;
		while(arr[i]!='\0')
		{
			arr[i]=(char)(arr[i]+32);
			i++;
		}
		return arr;
	}
}