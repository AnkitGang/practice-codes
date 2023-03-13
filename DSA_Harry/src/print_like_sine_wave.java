import java.util.*;

public class print_like_sine_wave {
	public static void sineWave(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		
		for(int j=0; j<cols; j++) {
			if(j%2 == 0) {
				for(int i=0; i<rows; i++) {
					System.out.print(arr[i][j] + " ");
				}
			}
			else {
				for(int i=rows-1; i>=0; i--) {
					System.out.print(arr[i][j] + " ");
				}
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
			
			System.out.println("Sine wave: ");
			sineWave(arr);
			
			cases--;
		}
		sc.close();

	}

}
