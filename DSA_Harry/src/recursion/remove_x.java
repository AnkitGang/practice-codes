package recursion;
import java.util.*;

public class remove_x {
	
	public static String remove(String str) {
		if(str.length() == 0) {
			return "";
		}
		else if(str.charAt(0) == 'x') {
			return remove(str.substring(1));
		}
		
		return str.charAt(0) + remove(str.substring(1));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		System.out.println(remove(str));
		
		sc.close();

	}

}
