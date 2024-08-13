package TwoDArray;

public class ToeplitzMatrix {
	public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length-1; i++){
            for(int j=0; j<matrix[i].length-1; j++){
                if(matrix[i][j] != matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		//A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.
		
	}
}
