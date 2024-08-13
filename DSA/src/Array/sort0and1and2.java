package Array;

public class sort0and1and2 {
	public static void sortColors(int[] nums) {
        int count0 = 0, count1 = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0)
                count0++;
            if(nums[i] == 1)
                count1++;
        }

        for(int i=0; i<count0; i++)
            nums[i] = 0;

        for(int i=count0; i < count0 + count1; i++)
            nums[i] = 1;

        for(int i= count0 + count1; i<nums.length; i++)
            nums[i] = 2;
    }
	
//	public static void sortColors(int[] nums) {
//        int i = nums.length-1;
//        int j = 0;
//        while(i > j){
//            if(nums[i] == 0){
//                swap(nums, i, j);
//                j++;
//            }
//            i--;
//        }
//
//        int k = nums.length-1;
//        while(j < k){
//            if(nums[j] == 0){
//                j++;
//            }
//            else if(nums[j] == 2 && nums[k] == 1){
//                swap(nums, j, k);
//                j++;
//                k--;
//            }
//            else if(nums[j] == 2 && nums[k] == 2){
//            	k--;
//            }
//        }
//    }
//
//    private static void swap(int [] nums, int i, int j){
//        nums[i] = nums[i] + nums[j];
//        nums[j] = nums[i] - nums[j];
//        nums[i] = nums[i] - nums[j];
//    }
    
    public static void main(String[] args) {
    	int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
		for(int elem : nums) {
			System.out.print(elem + " ");
		}
	}
}
