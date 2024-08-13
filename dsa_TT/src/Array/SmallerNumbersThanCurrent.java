package Array;

import java.util.Arrays;
import java.util.HashMap;

public class SmallerNumbersThanCurrent {
	public static int[] smallerNumbers(int[] nums) {
	//Approach 3 - Prefix sum technique
        int[] output = new int[nums.length];
        int [] hash = new int[101];   //Constraint is given 
        for(int i=0; i<nums.length; i++){
            if(hash[nums[i]] == 0){   //if new element comes
                hash[nums[i]] = 1;
            }
            else{
                hash[nums[i]] = hash[nums[i]] + 1;  //if element is already present then increment
            }
        }

        //Prefix Sum
        for(int i=1; i<hash.length; i++){
            int prev = hash[i-1];
            int curr = hash[i];
            hash[i] = prev + curr;  
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){//If 0 is already an element of array then put 0 as it is in output coz no element would be smaller than 0.
                output[i] = 0;
                continue;
            }
            output[i] = hash[nums[i]-1];
        }
        return output;
        
        
    //// Approach 2 - Using HashMap and sorting
      //TC O(NlogN)   SC O(N)
//               int orig[] = nums.clone();
//               Arrays.sort(nums);
//               HashMap<Integer, Integer> map = new HashMap<>();
//
//               for(int i=0; i<nums.length; i++){
//                   if(map.get(nums[i]) == null){
//                       map.put(nums[i], i);
//                   }
//               }
//               int[] output = new int[nums.length];
//               for(int i=0; i<nums.length; i++){
//                   output[i] = map.get(orig[i]);
//               }
//
//               return output;
        
        
    ////Approach 1 - Brute Force
        // int count = 0;   // TC O(N^2)
        // int[] arr = new int[nums.length];
        // for(int i=0; i<nums.length; i++){
        //     count = 0;
        //     for(int j=0; j<nums.length; j++){
        //         if(nums[j] < nums[i])
        //             count++;
        //     }
        //     arr[i] = count;
        // }
        
        // return arr;
        
        
	}
	
	public static void main(String[] args) {
		int[] arr = {8, 1, 2, 2, 3};
		int [] ans = new int[arr.length];
		ans = smallerNumbers(arr);
		
		for(int elem: ans)
			System.out.print(elem + " ");
	}
}
