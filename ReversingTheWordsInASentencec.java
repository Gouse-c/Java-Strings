import java.util.Scanner;
class ReversingTheWordsInASentencec
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence : ");
		String str=sc.nextLine();
		String words[]=str.split(" ");
		int i=0;
		int j=words.length-1;
		while(i<j)
		{
			String temp=words[i];
			words[i]=words[j];
			words[j]=temp;
			i++;
			j--;
		}
		for(i=0;i<words.length;i++)
		{
			System.out.print(words[i]+" ");
		}
	}
}