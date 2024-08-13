package Recursion;
public class PatternAnotherApproach {  //During stack fall
	public static void printStar(int numOfStars) {
		System.out.println("*");
		printStar(numOfStars - 1);
	}	
	
	private static void printLine(int numOfLines) {
		if(numOfLines == 0)
			return;
		
		printLine(numOfLines - 1);
		printStar(numOfLines);
		System.out.println();
		

	}
	
	public static void main(String[] args) {
		printLine(5);
	}
}