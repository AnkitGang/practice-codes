package recursion;
import java.util.*;

public class check_palindrome {
	
	private static boolean check(String str, int startIndex, int lastIndex) {
		if(startIndex >= lastIndex) {
			return true;
		}
		else if((startIndex < lastIndex) && (str.charAt(startIndex) == str.charAt(lastIndex))) {
			return check(str, startIndex + 1, lastIndex - 1);
		}
		
		return false;
	}
	
	public static boolean check(String str) {
		return check(str, 0, str.length()-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.next();
		
		System.out.println(check(str));
		sc.close();
	}
}
