package Array;
import java.util.*;

public class longestConsecutiveSequence {
	public static void main(String[] args) {
		int [] nums = {100,4,200,1,3,2};
		
		System.out.println(longestConsecutive(nums));
	}
	
	public static int longestConsecutive(int[] nums) {
		int n = nums.length;
		if(n == 0)
			return 0;
		
		Arrays.sort(nums);
		int count = 1;
		int maxCount = 0;
		
		for(int i=1; i<n; i++) {
			if(nums[i] != nums[i-1]) {
				if(nums[i] == nums[i-1] + 1) {
					count++;
				}
				else {
					maxCount = Math.max(maxCount, count);
					count = 1;
				}
			}
		}
		
        return Math.max(maxCount, count);
        
        
        
        
//        if(nums.length == 0)
//            return 0;
//
//        HashSet<Integer> set = new HashSet<>();
//        for(int n : nums)
//            set.add(n);
//
//        int count = 1;
//        int maxCount = 0;
//
//        for(int n : nums){
//            if(!set.contains(n-1)){
//                int x = n;
//                count = 1;
//                while(set.contains(x+1)){
//                    count++;
//                    x++;
//                }
//            }
//            maxCount = Math.max(maxCount, count);
//        }
//
//        return maxCount;
    }
}
