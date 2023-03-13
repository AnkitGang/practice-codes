package recursion;
import java.util.*;

public class string_to_integer {
	
	public static int number(String str, int startIndex) {
		if(str) {
			return str.charAt(0);
		}
		return str.charAt(0) + number(str.substring(1, str.length()));
	}
	
	public static int number(String str) {
		return number(str, 0);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.next();
		System.out.println(number(str));
		
		sc.close();

	}

}
