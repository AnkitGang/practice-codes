package recursion;

public class check_number {
	
	public static boolean check(int[] arr, int target) {
		if(arr.length == 0) {
			return false;
		}
		
		if(arr[0] == target) {
			return true;
		}
		
		int[] smallArr = new int[arr.length - 1];
		for(int i=1; i<arr.length; i++) {
			smallArr[i - 1] = arr[i];
		}
		
		return check(smallArr, target);
	}
	
	public static boolean checkBetter(int[] arr,int StartIndex, int target) {
		if(arr[StartIndex] == target) {
			return true;
		}
		
		if(StartIndex == arr.length - 1) {
			return false;
		}
		
		return checkBetter(arr, StartIndex + 1, target);
		
	}
	
	public static void main(String[] args) {
	
		int[] arr = {6, 7, 3, 9, 1};
		int[] arr1 = {1, 5, 9, 0};
		int target = 0;
		System.out.println(check(arr, target));
		System.out.println(checkBetter(arr1, 0, target));
	}
}
