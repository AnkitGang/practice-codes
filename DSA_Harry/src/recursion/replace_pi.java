package recursion;

import java.util.*;

public class replace_pi {
	
	private static String pi(String str) {
		if(str.length() <= 1) {
			return str;
		}
		else if(str.charAt(0) == 'p' && str.charAt(1) == 'i' && str.length() >= 2) {
			return "3.14" + pi(str.substring(2, str.length()));
		}
		
		return str.charAt(0) + pi(str.substring(1, str.length()));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.next();
		System.out.println(pi(str));
		
		sc.close();
	}

}
 