package Recursion;

//import java.util.List;

public class PascalTriangle {
	public static void Pattern(int numRows) {
		for(int k=0; k<numRows; k++)
			System.out.println(" ");
		
		for(int i=0; i<numRows; i++) {
			for(int j=0; j<=i; j++)
				System.out.println(pascal(i, j) + " ");
		}
		
		System.out.println();
	}
	
	public static int pascal(int row, int col) {
		if(col == 0 || col == row) {
			return 1;
		}
		else {
			return pascal(row-1, col-1) + pascal(row-1, col);
		}
	}
	
	public static void main(String[] args) {
		Pattern(5);
	}
}
