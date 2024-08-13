package TwoDArray;

public class SearchMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {  //74 leetcode
        int low = 0;
        int high = matrix[0].length-1;
        while(low < matrix.length && high >= 0){
            if(matrix[low][high] == target){
                return true;
            }
            else if(matrix[low][high] > target){
                high--;
            }
            else if(matrix[low][high] < target){
                low++;
            }
        }
        return false;
    }
	
	public static void main(String[] args) {
		
	}
}
