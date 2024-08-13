package BitManipulation;

public class MaxBitAND {  //find max bitwise AND value for any two int in array
	
	public static int MaxValue(int[] arr) {    // time O(N*N)
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				int bitwiseAnd = arr[i] & arr[j];
				if(max < bitwiseAnd)
					max = bitwiseAnd;
			}
		}
		
		return max;
	}
	
	public static int maxValue(int [] arr, int low, int high) {    //time O(N)
		int max = 0;
		
		while(low<high) {
		    int a = arr[low] & arr[high];
		    if(a>max) {
		        max = a;
		        high--;}
		    else
		        low++;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 5, 8, 10, 12};
		
		System.out.println(MaxValue(arr));
		
		System.out.println(maxValue(arr, 0, arr.length-1));
	}

}
