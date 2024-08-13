package String;

import java.util.HashSet;
import java.util.Set;

public class SubstringPalindrome {
	private static boolean isPalindrome(String str) {
		int low = 0; 
		int high = str.length()-1;
		
		while(low <= high) {
			if(str.charAt(low) != str.charAt(high))
				return false;
			
			low++;
			high--;
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		// str = abccbc
		//substring can be a,b,c,c,b,c, ab, abc, abcc, bccb, cc, bccbc .....
		//palindrome substring can be a,b,c,c,b,c, bccb, cc ,....
		
		Set<String> set = new HashSet<>();  //if we dont want repeated substring put them in set
		
		
		String str = "abccbc";
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j <= str.length(); j++) {
				String temp = str.substring(i, j);
				if(isPalindrome(temp)) {
					set.add(temp);
				}
			}
		}
		
		for(String elem : set)
			System.out.print(elem + " ");
	}

}
