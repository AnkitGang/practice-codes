package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//LeetCode problem
public class TwoSum {
	public static void main(String[] args) {
		int [] arr = {2, 7, 11, 15};
		int target = 9;
		
		//Approach 1  --> O(n^2)
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				int sum = arr[i] + arr[j];
//				if(sum == target) {
//					System.out.println("two sum: " + arr[i] + " " + arr[j]);
//					return ;
//				}
//			}
//		}
		
		
		//Approach 2 ---> Two Pointer Approach  O(NlogN)
//		Arrays.sort(arr);
//		int low = 0;
//		int high = arr.length-1;
//		while(low < high) {
//			if((arr[low] + arr[high]) == target) {
//				System.out.println("two sum: " + arr[low] + " " + arr[high]);
//				return ;
//			}
//			if((arr[low] + arr[high]) < target)
//				low++;
//			else if((arr[low] + arr[high]) > target)
//				high--;
//		}
		
		
		//Approach 3  --> using custom hashMap technique
		int max = 0;
		
		for(int element : arr)
			if(element > max)
				max = element;
		
		int [] hash = new int[max + 1];
		for(int i=0; i<hash.length; i++)
			hash[i] = -1;
		
		int[] ans = new int[2];
		
		for(int i=0; i<arr.length; i++) {
			if(hash[arr[i]] == -1) {
				int index = target - arr[i];
				hash[index] = i;
			}
			else {
				ans[0] = hash[arr[i]];
				ans[1] = i;
				break;
			}
		}
		
		for(int elem: ans)
			System.out.print(elem + " ");
		
		
		
	}
	
	public static int[] twoSum(int[] nums, int target) {  //Approach 4 --> Using in-built HashMap in Java Collections
		Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[] {map.get(target - nums[i]), i};
            }
            else{
                map.put(nums[i], i);
            }
        }
        return null;
	}
}
