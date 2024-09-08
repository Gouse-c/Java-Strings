import java.util.Scanner;
class ToPrintHalfString{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		printHalfString(str);
	}
	public static void printHalfString(String str){
		int length=str.length();
		int halfLength=length/2;
		String halfStr=str.substring(0,halfLength);
		System.out.println("The Half String is : "+halfStr);
	}
}