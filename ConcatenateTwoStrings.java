import java.util.Scanner;
class ConcatenateTwoStrings{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String 1 :");
		String str1=sc.nextLine();
		System.out.println("Enter the String 2 :");
		String str2=sc.nextLine();
		String result=concatenate(str1,str2);
		System.out.println("Concatenated String is : "+result);
	}
	public static String concatenate(String str1,String str2){
		return str1+ " " + str2;
	}
}