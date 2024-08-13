package string;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public static int lengthOfLongestSubstring(String s) {
		
		Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int left = 0;

        for(int right=0; right<s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
        
        
//		int length = 0;
//        
//        for (int i = 0; i < s.length(); i++) {
//            Set<Character> set = new HashSet<>();
//            for (int j = i; j < s.length(); j++) {
//                char c = s.charAt(j);
//                if (set.contains(c)) {
//                    break; // Break out of the inner loop when a duplicate is found
//                }
//                set.add(c); // Add character c to the set
//                length = Math.max(length, j - i + 1);
//            }
//        }
//        
//        return length;
		
//		
	}
	
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("aab"));
	}
}
