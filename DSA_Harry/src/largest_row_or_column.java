import java.util.*;

public class largest_row_or_column {
	public static void largestSum(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		int max = 0;
		int MaxRowSum = 0;
		int MaxColSum = 0;
		int rowIndex = 0, colIndex = 0;
		
		for(int i=0; i<rows; i++) {
			int RowSum = 0;

			for(int j=0; j<cols; j++) {
				RowSum += arr[i][j];
			}
			
			if(MaxRowSum < RowSum) {
				MaxRowSum = RowSum;
				rowIndex = i;
			}
		}
		
		for(int j=0; j<cols; j++) {
			int ColSum = 0;

			for(int i=0; i<rows; i++) {
				ColSum += arr[i][j];
			}
			
			if(MaxColSum < ColSum) {
				MaxColSum = ColSum;
				colIndex = j;
			}
		}
		
		if(MaxRowSum > MaxColSum) {
			System.out.println("row " + rowIndex + " " + MaxRowSum);
		}
		else if(MaxRowSum < MaxColSum){
			System.out.println("column " + colIndex + " "  + MaxColSum);
		}
		else if(MaxRowSum == MaxColSum) {
			System.out.println("equal: row: " + rowIndex + " column: " + colIndex + " sum: " + MaxRowSum);
		}
		else {
			System.out.println("Invalid");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of test cases:");
		int cases = sc.nextInt();
		
		while(cases != 0) {
			System.out.println("Enter number of rows and columns:");
			int rows = sc.nextInt();
			int cols = sc.nextInt();
			int[][] arr = new int[rows][cols];
			
			System.out.println("Enter values:");
			for(int i=0; i<rows; i++) {
				for(int j=0; j<cols; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Your Matrix:");
			for(int i=0; i<rows; i++) {
				for(int j=0; j<cols; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			
			largestSum(arr);
			
			cases--;
		}
		sc.close();
	}
}
