package recursion;

import java.util.Scanner;

public class PrintStairsPath {
	public static void printStairsPath(int stairs, String ans) {
		if(stairs == 0) {
			System.out.print(ans + ", ");
			return;
		}
		else if(stairs < 0) {
			return;
		}
		
		printStairsPath(stairs - 1, ans + "1");
		printStairsPath(stairs - 2, ans + "2");
		printStairsPath(stairs - 3, ans + "3");
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of stairs: ");
		int stairs = sc.nextInt();
		
		printStairsPath(stairs, "");		
		sc.close();
	}
}
