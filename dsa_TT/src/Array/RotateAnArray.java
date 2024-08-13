package Array;

public class RotateAnArray {
	
//	static void reverse(int[] arr, int low, int high) {
//		while(low < high) {
//			int temp = arr[low];
//			arr[low] = arr[high];
//			arr[high] = temp;
//			low++;
//			high--;
//		}
//	}
	
	public static void rotate(int[] nums, int k) {
        k = k % nums.length;

        int[] left = new int[nums.length - k];
        int[] right = new int[k];

        for(int i=0; i<left.length; i++){
            left[i] = nums[i];
        }
        for(int i=0; i<right.length; i++){
            right[i] = nums[i + k + 1];
        }

        int index = 0;
        for(int j=0; j<right.length; j++){
            nums[index++] = right[j];
        }
        for(int j=0; j<left.length; j++){
            nums[index++] = left[j];
        }
    }
	
	public static void main(String[] args) {
//		int rotations = -2;
		int [] arr = {10, 20, 30 , 40, 50, 60, 70};
		
		int rotations = 3;
		rotate(arr, rotations);
		
//		//rotations must be in range
//		rotations %= arr.length;
//		
//		if(rotations < 0)
//			rotations += arr.length;
//		
//		///reverse the first part  of array
//		reverse(arr, 0, arr.length - rotations - 1);
//		
//		//second part of the array will be reversed	
//		reverse(arr, arr.length - rotations, arr.length-1);
//		
//		//reverse the entire array
//		reverse(arr, 0, arr.length-1);
//		
		for(int elem: arr)
			System.out.print(elem + " ");
	}
}
