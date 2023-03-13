package recursion;

public class array_sum {
	
	public static int sum(int[] arr) {
		if(arr.length == 1) {
			return arr[0];
		}
		int[] smallArr = new int[arr.length - 1];
		for(int i=1; i<arr.length; i++) {
			smallArr[i - 1] = arr[i];
		}
		return arr[0] + sum(smallArr);
	}
	
	public static int sumBetter(int[] arr,int StartIndex) {
		if(StartIndex == arr.length - 1) {
			return arr[StartIndex];
		}
		
		return sumBetter(arr, StartIndex + 1) + arr[StartIndex];
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5, 6, 8};
		int[] arr1 = {4, 5, 0, 1, 12};
		System.out.println(sum(arr));
		System.out.println(sumBetter(arr1, 0));
	}
}
