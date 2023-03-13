import java.util.*;

public class remove_Duplicates {
	public static void removeDuplicates(String str) {
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(int i=0; i<str.length(); i++) {
			set.add(str.charAt(i));
		}
		
		for(Character ch: set) {
			System.out.print(ch);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.nextLine();
		removeDuplicates(str);
		
		sc.close();
	}
}
