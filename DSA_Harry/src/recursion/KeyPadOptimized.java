package recursion;

import java.util.Scanner;

public class KeyPadOptimized {  //here we are not storing the values in any ArrayList..so if the input string is too long 
	 							//it wont lag due to high space consumption
	public static String[] characters = {"/?", ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

	public static void printKeyCombinations(String ques, String ans) {
		if(ques.length() == 0) {
			System.out.print(ans + ", ");
			return ;
		}
		
		char ch = ques.charAt(0);
		String resOfQues = ques.substring(1);
		
		String codeForCh = characters[ch - '0'];
		for(int i=0; i<codeForCh.length(); i++) {
			char chOption = codeForCh.charAt(i);
			printKeyCombinations(resOfQues, ans + chOption);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter keypad number: ");
		String n = sc.next();
		printKeyCombinations(n, "");
		sc.close();
	}
}
