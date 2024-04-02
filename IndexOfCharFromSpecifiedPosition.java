import java.util.Scanner;
class IndexOfCharFromSpecifiedPosition
{
	public static void main(String args[])
	{
		int res=indexOf('R',6);
		System.out.println("The index position of the character from the specified position is : "+res);
	}
	public static int indexOf(char ch,int start)
	{
		String str="RajaRamMohanRoy";
		str=str.concat("\0");
		char arr[]=str.toCharArray();
		int i=start;
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