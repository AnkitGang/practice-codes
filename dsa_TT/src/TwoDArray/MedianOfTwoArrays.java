package TwoDArray;

public class MedianOfTwoArrays {  // 4. LeetCode 
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = merge(nums1, nums2);

        if(ans.length % 2 == 0){
            return (float)((ans[ans.length/2] + ans[ans.length/2 - 1])/2.0);
        }
        else
            return ans[ans.length/2];
    }
	
	private static int[] merge(int[] nums1, int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;
        int k = 0;
        int i = 0;
        int j = 0;
        int [] nums = new int[n1 + n2];

        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                nums[k] = nums1[i];
                i++;
                k++;
            }
            else{
                nums[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i < nums1.length){
            nums[k] = nums1[i];
            i++;
            k++;
        }

        while(j < nums2.length){
            nums[k] = nums2[j];
            j++;
            k++;
        }

        return nums;
    }
	
	public static void main(String[] args) {
		int[] a = {1,2};
		int[] b = {3,4};
		
		int[] c = merge(a, b);
		for(int elem: c)
			System.out.print(elem + " ");
			
		System.out.println();
		
		double ans = findMedianSortedArrays(a, b);
		System.out.println(ans);
	
	}
}
