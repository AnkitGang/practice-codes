package Array;

import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		int [] nums = {1, 1, 2};
		//Approach 1   --> It creates a set and does not change in the original array
//		HashSet<Integer> set = new HashSet<>();
//        for(int elem : nums)
//            set.add(elem);
//        
//        System.out.println(set.size());
        
        
		
		//Approach 2
		int j=0; 
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        
        System.out.println("new size: " + (j+1));
	}
}
