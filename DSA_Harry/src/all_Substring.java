import java.util.*;

public class all_Substring {
	public static void allSubstring(String str) {
		for(int i=0; i<str.length(); i++) {
			for(int j=i; j<str.length(); j++) {
				System.out.println(str.substring(i, j+1));
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter string:");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		allSubstring(str);
		sc.close();
	}
}
