package Recursion;

public class Pattern2 {
	public static void printStar(int numOfStars) {  
		if(numOfStars == 0)
			return;
		
		System.out.print("*");
		printStar(numOfStars - 1);
	}
	
	private static void printLine(int numOfLines) {
		if(numOfLines == 0)
			return;
		
		printStar(numOfLines);
		System.out.println();
		printLine(numOfLines - 1);

	}
	
	public static void main(String[] args) {
		printLine(5);
	}
}
