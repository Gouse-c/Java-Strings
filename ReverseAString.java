import java.util.Scanner;
class ReverseAString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		String str1=" ";
		for(int i=str.length()-1;i>=0;i--){
			str1=str1+str.charAt(i);
		}
		System.out.println("Reversed String : "+str1);
	}
}