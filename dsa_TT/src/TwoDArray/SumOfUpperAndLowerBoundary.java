package TwoDArray;

public class SumOfUpperAndLowerBoundary {
	public static void main(String[] args) {
		int[][] matrix = {
				{6, 5, 4},
				{1, 2, 5},
				{7, 9, 7}
		};
		
		int upperSum = 0;
		int lowerSum = 0;
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				if(i <= j) {
					upperSum += matrix[i][j];   // 6+5+4+2+5+7
				}
				if(j <= i) {
					lowerSum += matrix[i][j];   // 6+1+2+7+9+7
				}
			}
		}
		System.out.println("Upper Sum = " + upperSum);
		System.out.println("Lower Sum = " + lowerSum);
	}
}		
