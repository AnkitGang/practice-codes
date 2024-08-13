package String;

public class StringPatternMatching {  //popular approaches
	//1. Rabin-Carp Algo
	//2. KMP Algo
	
	
	//Time Complexity -> O(N*M)
	public static int isMatching(String str, String pattern) {  //naive approach
		int n = str.length()-1;
		int m = pattern.length()-1;
		
		
		for(int i=0; i< n-m; i++) {
			int j=0;
			while(j < m && str.charAt(i+j) == pattern.charAt(j))
				j++;
			if(j == m)
				return i;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		String text = "abaccbccbac";
		 String pattern = "bccbc";
		
		System.out.println("Found at index " + isMatching(text, pattern));
	}
}
