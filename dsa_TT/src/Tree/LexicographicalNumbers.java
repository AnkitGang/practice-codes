package Tree;

import java.util.*;

public class LexicographicalNumbers {
	public static void main(String [] args) {
		System.out.println("Enter till how many numbers you want: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			printLex(i, n);
		}
	}
	
	private static void printLex(int i, int n) {
		if(i > n) 
			return;
		
		System.out.println(i);
		for(int j=0; j<=9; j++) {
			printLex(10 * i + j, n);
		}
	}
}
