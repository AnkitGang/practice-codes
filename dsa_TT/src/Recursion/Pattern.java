package Recursion;

public class Pattern{  
	public static void printStar(int numOfStars) {  //void means During stack build
		if(numOfStars == 0)							//return type means during stack falling
			return;
		
		System.out.print("*");
		printStar(numOfStars - 1);
	}
	
	private static void printLine(int numOfLines, int numOfStars) {
		if(numOfLines == 0)
			return;
		
		printStar(numOfStars);
		
		System.out.println();
		printLine(numOfLines - 1, numOfStars + 1);

	}
	
	public static void main(String[] args) {
		printLine(5, 1);
	}
}
