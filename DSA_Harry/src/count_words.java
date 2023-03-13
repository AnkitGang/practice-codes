import java.util.*;

public class count_words {
	public static void countWords(String str) {
		int count=1;
		for(int i=0; i<str.length(); i++) {
			if((str.charAt(i) == ' ') && str.charAt(i+1) != ' ') {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.nextLine();
		countWords(str);
		
		sc.close();
	}
}
