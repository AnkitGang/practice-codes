import java.util.*;

public class string_palindrome {
	public static void checkPalindrome(String str) {
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}
	
	public static void main(String[] args) {
		System.out.println("Enter String:");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		checkPalindrome(str);
		
		sc.close();
	}
}
