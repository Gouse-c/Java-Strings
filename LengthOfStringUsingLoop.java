import java.util.Scanner;
class LengthOfStringUsingLoop{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		int length=stringLength(str);
		System.out.println("The length of the String given is: "+length);
	}
	public static int stringLength(String str){
		int length=0;
		for(int i=0;i<str.length();i++){
			length++;
		}
		return length;
	}
}