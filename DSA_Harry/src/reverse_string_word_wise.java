import java.util.*;

public class reverse_string_word_wise {
	public static void reverseStringWord(String str) {
		String[] string = str.split(" ");
		String newStr = "";
		for(int i=string.length-1; i>=0; i--) {
			newStr += string[i] + " ";
		}
		
		System.out.println(newStr);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter String:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		reverseStringWord(str);
		sc.close();
	}
}
