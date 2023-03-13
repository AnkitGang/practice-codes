import java.util.*;

public class highest_occurring_char {
	public static void highOccurChar(String str) {
		int[] count = new int[str.length()];
		char maxChar = str.charAt(0);
		
		char[] string = str.toCharArray();
		
		for(int i=0; i<str.length(); i++) {
			count[i] = 1;
			for(int j=i+1; j<str.length(); j++) {
				if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
					count[i]++;
					string[j] = '0';
				}
			}
		}
		
		for(int k=0; k<string.length; k++) {
			System.out.print(string[k]);
			
		}
		System.out.println();
		
		for(int k=0; k<string.length; k++) {
			System.out.print(count[k]);
		}
		System.out.println();
		
		int max = count[0];
		for(int k=0; k<string.length; k++) {
			if(max < count[k]) {
				max = count[k];
				maxChar = string[k];
			}
		}
		System.out.println("Maximum occurring character: " + maxChar);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter String:");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		highOccurChar(str);
		sc.close();
	}
}
