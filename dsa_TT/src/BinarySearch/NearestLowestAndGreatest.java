package BinarySearch;

public class NearestLowestAndGreatest {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		int low = 0;
		int high = arr.length-1;
		int searchElement = 72;
		int i=0;
		
		int nearestLowestNumber = 0;
		int nearestGreatestNumber = 0;
		while(i < arr.length) {
			int mid = (low+high)/2;
			if(searchElement > arr[mid]) {
				nearestLowestNumber = arr[mid];
				low = mid + 1;
			}
			else if(searchElement < arr[mid]) {
				nearestGreatestNumber = arr[mid];
				high = mid-1;
			}
			else {
				nearestLowestNumber = nearestGreatestNumber = arr[mid];
				return ;
			}
			i++;
		}
		
		System.out.println("search:" + searchElement);
		System.out.println("Nearest Lowest Number: " + nearestLowestNumber);
		System.out.println("Nearest Greatest Number: " + nearestGreatestNumber);
	}
}
