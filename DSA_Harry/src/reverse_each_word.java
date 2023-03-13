import java.util.*;

public class reverse_each_word {
	public static void reverseEachWord(String str) {
		String[] words = str.split(" ");
		String reversedString = "";
		
		for(int i=0; i<words.length; i++) {
			String word = words[i];
			String reversedWord = "";
			
			for(int j=word.length()-1; j>=0; j--) {
				reversedWord += word.charAt(j);
			}
			
			reversedString += reversedWord + " ";
		}
		
		System.out.println(reversedString);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter string:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		reverseEachWord(str);
		
		sc.close();
	}
}
