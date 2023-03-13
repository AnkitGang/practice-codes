import java.util.*;

public class row_wise_sum {
	public static void rowSum(int[][] arr,int rows,int cols) {
		int sum =0;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				sum += arr[i][j];
			}
			System.out.print(sum + " ");
			sum=0;
		}
		System.out.println();
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
			
			System.out.println("Sum of rows: ");
			rowSum(arr, rows, cols);
			
			cases--;
		}
		sc.close();
	}
}
