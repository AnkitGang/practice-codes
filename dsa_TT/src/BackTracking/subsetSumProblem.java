package BackTracking;

public class subsetSumProblem {
	
//	//GFG problem
//	static Boolean isSubsetSum(int N, int arr[], int sum){
//        // code here
//        if(sum == 0){
//            return true;
//        }
//        
//        if(N == 0){
//            return false;
//        }
//        
//        if(arr[N-1] <= sum){
//        	//Include the Sum         //Not include the sum
//        	return isSubsetSum(N-1, arr, sum - arr[N-1]) || isSubsetSum(N-1, arr, sum);
//        }
//        else{
//            return isSubsetSum(N-1, arr, sum);
//        }
//    }
	
	
	
	
	//LeetCode Problem
	int count = 0;
    
    public int findTargetSumWays(int[] nums, int target) {
        compute(nums, 0, 0, target);
        return count;
    }
    
    private void compute(int[] nums, int sum, int index, int target){
        if(index == nums.length){
            if(sum == target)
                count++;
        }
        else{
            //here we don't have sum predefined so we first add the element and then we subtract it for removing the same element from sum to make it not include
            //Include
        	compute(nums, sum + nums[index], index + 1, target);
        
        	//Not Include
        	compute(nums, sum - nums[index], index + 1, target);
        }
    }
    
    public static void main(String[] args) {
    	subsetSumProblem s = new subsetSumProblem();
    	
		int[] arr = {1, 2, 3, 4, 5};
    	
    	//System.out.println(isSubsetSum(5, arr, 6));
		
		int [] arr1 = {1, 1, 1, 1, 1};
		System.out.println(s.findTargetSumWays(arr1, 3));
	}
}
