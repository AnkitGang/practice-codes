package recursion;
import java.util.*;

public class first_index {
	private static int index(int[] arr, int target, int startIndex) {
		if(startIndex == arr.length) {
			return -1;
		}
		if(arr[startIndex] == target) {
			return startIndex;
		}
		
		return index(arr, target, startIndex + 1);
	}
	
	static int index(int[] arr, int target) {
		return index(arr, target, 0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter array:");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter target:");
		int target = sc.nextInt();
		
		System.out.println(index(arr, target));
		sc.close();
	}

}
