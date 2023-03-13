package recursion;

import java.util.*;

public class all_indexes_of_x {
	
	private static int[] index(int[] arr, int target, int startIndex, int[] idxArr, int i) {
		if(startIndex == arr.length) {
			return idxArr;
		}
		else if(arr[startIndex] == target) {
			idxArr[i] = startIndex;
			i++;
		}
		
		return index(arr, target, startIndex + 1, idxArr, i);
	}
	
	public static int[] index(int[] arr, int target) {
		int[] idxArr = new int[arr.length];
		return index(arr, target, 0, idxArr, 0);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter target: ");
		int target = sc.nextInt();
		
		boolean check = false;
		
		for(int element : arr) {
			if(element == target) {
				check = true;
				break;
			}
		}
		
		//System.out.println("Index : " + Arrays.toString(index(arr, target)));
		if(check) {
			int[] idxArr = index(arr, target);
			System.out.print(idxArr[0] + " ");
			for(int i=1; i<idxArr.length; i++) {
				if(idxArr[i] == 0)
					continue;
				System.out.print(idxArr[i] + " ");
			}
		}
		else {
			System.out.print("not present");
		}
		
		sc.close();
	}

}
