import java.util.Scanner;
class StringPalindromeChecking{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String name : ");
		String str=sc.nextLine();
		if(isPalindrome(str)){
			System.out.println("The given string is a Palindrome String..");
		}else{
			System.out.println("The given String is not a Palindrome String..");
		}
	}
	public static boolean isPalindrome(String str){
		int length=str.length();
		for(int i=0;i<length/2;i++){
			if(str.charAt(i)!=str.charAt(length-i-1)){
				return false;
			}
		}
		return true;
	}
}