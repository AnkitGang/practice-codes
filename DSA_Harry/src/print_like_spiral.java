import java.util.Scanner;

public class print_like_spiral {
	public static void printSpiral(int[][] arr) {
		int k = 0;              //starting index row
		int m = arr.length;     //last index row
		int l = 0;              //starting index col
		int n = arr[0].length;  //last index col
		int i;
		
		while(l<n && k<m) {
			// Print the first row from the remaining rows
			for(i=l; i<n; i++) {
				System.out.print(arr[k][i] + " ");
			}
			k++;
			
			// Print the last column from the remaining columns
			for(i=k; i<m; i++) {
				System.out.print(arr[i][n-1] + " ");
			}
			n--;
			
			// Print the last row from the remaining rows
			if(k<m) {
				for(i=n-1; i>=l; i--) {
					System.out.print(arr[m-1][i] + " ");
				}
				m--;
			}
			
			// Print the first column from the remaining columns
			if(l<n) {
				for(i=m-1; i>=k; i--) {
					System.out.print(arr[i][l] + " ");
				}
				l++;
			}
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
			
			System.out.println("Spiral: ");
			printSpiral(arr);
			
			cases--;
		}
		sc.close();

	}

}
