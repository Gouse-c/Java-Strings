import java.util.Scanner;
class StringPalindromeOrNot{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		if(isPalindrome(str)){
			System.out.println("Given String is Palindrome...");
		}else{
			System.out.println("Given String is not a Palindrome...");
		}
	}
	public static boolean isPalindrome(String str){
		String str1="";
		for(int i=str.length()-1;i>=0;i--){
			str1=str1+str.charAt(i);
		}
		if(str.equalsIgnoreCase(str1)){
			return true;
		}else{
			return false;
		}
	}
}