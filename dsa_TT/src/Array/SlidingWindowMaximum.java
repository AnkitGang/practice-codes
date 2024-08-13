package Array;

public class SlidingWindowMaximum {
	public static int[] maxSlidingWindow(int[] nums, int k) {
		
		int[] maxArray = new int[nums.length-k+1];
        int currMax = Integer.MIN_VALUE;
        int index = 0;
        
//        for(int i=0; i<k; i++){
//            if(nums[i] > currMax){
//                currMax = nums[i];
//            }
//        }
//
//        maxArray[index++] = currMax;
//
//        for(int j=k; j<nums.length; j++){
//            if(nums[j] > currMax){
//                maxArray[index++] = nums[j];
//                //currMax = nums[j];
//            }
//            else{
//                maxArray[index++] = currMax;
//            }
//        }
        
        for(int i=0; i<nums.length-k+1; i++) {
        	currMax = Integer.MIN_VALUE;
        	for(int j=i; j<i+k; j++) {
        		if(nums[j] > currMax) {
        			currMax = nums[j];
        		}
        	}
        	maxArray[index++] = currMax;
        }

        return maxArray;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		int [] ans = maxSlidingWindow(nums, k);
		for(int elem: ans)
			System.out.print(elem + " ");
		
//		int[] nums1 = {1,-1};
//		int m = 1;
//		int [] ans = maxSlidingWindow(nums1, m);
//		for(int elem: ans)
//			System.out.print(elem + " ");
	}
}
