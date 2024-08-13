package Array;

public class FindDuplicateInArray {
	public int findDuplicate(int[] nums) {
	////fulfills all conditions
	        int duplicateElement = -1;
	        for(int i=0; i<nums.length; i++){
	            int index = Math.abs(nums[i]);
	            if(nums[index] < 0){
	                duplicateElement = index;
	                break;
	            }
	            nums[index] = nums[index] * -1;
	        }

	        //get back to original array
	        for(int i=0; i<nums.length; i++){
	            nums[i] = Math.abs(nums[i]);
	        }

	        return duplicateElement;
	    }
}
