import java.util.Scanner;
class LastIndexOf
{
	public static void main(String args[])
	{
		int res=lastIndexOf('R');
		System.out.println("The last index of the specified character is : "+res);
	}
	public static int lastIndexOf(char ch)
	{
		String str="RajaRamMohanRoy";
		str=str.concat("\0");
		char arr[]=str.toCharArray();
		int i=arr.length-1;
		while(i>=0 && arr[i]!=ch)
		{
			i--;
		}
		if(arr[i]==ch)
		{
			return i;
		}
		else
		{
			return -1;
		}
	}
}