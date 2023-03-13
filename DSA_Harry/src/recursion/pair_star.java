package recursion;
import java.util.*;

public class pair_star {
	
	private static String pair(String str) {
		if(str.length() == 1) {
			return str;
		}
		else if(str.charAt(0) == str.charAt(1)) {
			return str.charAt(0) + "*" + pair(str.substring(1));
		}
		
		return str.charAt(0) + pair(str.substring(1, str.length()));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.next();
		
		System.out.println(pair(str));
		
		sc.close();
	}

}
