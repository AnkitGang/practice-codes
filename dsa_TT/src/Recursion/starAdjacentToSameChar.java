package Recursion;

import java.util.Scanner;

public class starAdjacentToSameChar {
	public static void printStar(String str, String newStr, char firstChar) {  //Stack Build
		if(str.length() == 1) {
			System.out.println(newStr + firstChar);
			return ;
		}
		
		firstChar = str.charAt(0);
		if(firstChar == str.charAt(1)) {
			newStr += firstChar + "*";
			printStar(str.substring(1), newStr, firstChar);
		}
		else {
			newStr += firstChar;
			firstChar = str.charAt(1);
			printStar(str.substring(1), newStr, firstChar);
		}
	}
	
	public static StringBuilder printStar(String str, char firstChar) {
		if(str.length() == 1) {
			firstChar = str.charAt(0);
			StringBuilder newStr = new StringBuilder(str);
			return newStr;
		}
		
		StringBuilder newStr = printStar(str.substring(1), firstChar);
		
		if(firstChar == str.charAt(0)) {
			newStr.insert(0, "*");
			newStr.append(newStr.insert(0, str.charAt(0)));
		}
		firstChar = str.charAt(0);
		
		return newStr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printStar(str, "", str.charAt(0));
		System.out.println(printStar(str, str.charAt(0)));
		sc.close();
	}
}
