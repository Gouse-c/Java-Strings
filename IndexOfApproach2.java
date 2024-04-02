import java.util.Scanner;
class IndexOfApproach2
{
	public static void main(String args[])
	{
		int res=indexOf('m');
		System.out.println("The index position of the character is :" +res);
	}
	public static int indexOf(char ch)
	{
		String str="RajaRamMohanRoy";
		str=str.concat("\0");
		char arr[]=str.toCharArray();
		int i=0;
		while(arr[i]!='\0' && arr[i]!=ch)
		{
			i++;
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