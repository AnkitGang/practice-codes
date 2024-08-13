package String;

import java.util.HashMap;

public class FirstUniqueChar {
	static int firstUnique(String s) {
		HashMap<Character, Integer> count = new HashMap<>();
		int n = s.length();
		
		for(int i=0; i<n; i++) {
			char c = s.charAt(i);
			count.put(c, count.getOrDefault(c, 0) + 1);
		}
		
		for(int i=0; i<n; i++) {
			if(count.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String s = "abbcc";
		System.out.println(firstUnique(s));
	}
}
