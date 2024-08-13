package BinarySearch;

public class FirstAndLastIndex {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 40, 40, 70, 80, 90};
		int low = 0;
		int high = arr.length-1;
		int searchElement = 40;
		int firstIndex = -1;
		int lastIndex = -1;
		
		while(low <= high) {
			int mid = (low+high)/2;
			if(arr[mid] == searchElement) {
				firstIndex = mid;
				high = mid-1;
			}
			else if(arr[mid] > searchElement) {
				low = mid + 1;
				
			}
		}
	}
}
