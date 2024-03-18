package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyPad {
	public static String[] characters = {"/?", ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	public static ArrayList<String> keyPadSubsequences(String str) {
		if(str.length() == 0) {
			ArrayList<String> baseRes = new ArrayList<>();
			baseRes.add("");
			return baseRes;
		}
		
		char c = str.charAt(0);
		ArrayList<String> smallRes = keyPadSubsequences(str.substring(1));
		ArrayList<String> ans = new ArrayList<>();
		
		String valueOfC = characters[c - '0'];  //c is a string so to get the actual int value of c using Ascii table
		
		for(int i = 0; i < valueOfC.length(); i++) {
			char charOfC = valueOfC.charAt(i);
			
			for(String s: smallRes) {
				ans.add(s + charOfC);
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter keypad number: ");
		String n = sc.next();
		ArrayList<String> ans = keyPadSubsequences(n);
		System.out.println(ans);
		sc.close();
	}
}
