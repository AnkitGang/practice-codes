package Recursion;

public class PatternLeftPyramid {
	private static void printLine(int rows, int star) {
		if(rows == 0)
			return;
		
		if(star > 0) {
			System.out.print("*");
			printLine(rows, star-1);
		}
		else {
			System.out.println();
			printLine(rows-1, rows-1);
		}

	}
	
	public static void main(String[] args) {
		printLine(5, 5);
	}
}
