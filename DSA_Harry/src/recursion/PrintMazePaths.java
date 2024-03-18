package recursion;

import java.util.Scanner;

public class PrintMazePaths {
	public static void printMazePaths(int startRow, int startCol, int destRow, int destCol, String ans) {
		if(startRow == destRow && startCol == destCol) {
			System.out.println(ans);
			return;
		}
		
		
		if(startRow < destRow) {
			printMazePaths(startRow + 1, startCol, destRow, destCol, ans + "v");
		}
		if(startCol < destCol) {
			printMazePaths(startRow, startCol + 1, destRow, destCol, ans + "h");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Rows in Matrix: ");
		int rows = sc.nextInt();
		System.out.println("Enter number of Cols in Matrix: ");
		int cols = sc.nextInt();
		System.out.println("Enter start Row index: ");
		int startRow = sc.nextInt();
		System.out.println("Enter start Col index: ");
		int startCol = sc.nextInt();
		
		printMazePaths(startRow, startCol, rows, cols, "");
		sc.close();
	}
}
