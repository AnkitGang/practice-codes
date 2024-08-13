package Array;

public class kadane_algo {
	public static int maxSubArray(int[] nums) {
        int curr = 0;
        int max = nums[0];

        for(int i=0; i<nums.length; i++){
            curr += nums[i];
            if(curr > max)
                max = curr;
            if(curr < 0)
                curr = 0;
        }

        return max;
    }
	
	public static void main(String[] args) {
		int[] nums = {-2,-3,-1,-5};
		
		System.out.println(maxSubArray(nums));
	}
}
