import java.util.*;

public class remove_character {
	public static void removeCharacter(String str, char target) {
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != target) {
				System.out.print(str.charAt(i));
			}else {
				//str.replace("target", "");
				
				//OR simply
				continue;
				
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter string:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Enter which character to remove:");
		char target = sc.next().charAt(0);
		removeCharacter(str, target);
		sc.close();
	}
}
