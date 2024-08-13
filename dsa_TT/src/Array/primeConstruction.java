package Array;

import java.util.Arrays;

public class primeConstruction {
	private static boolean prime(int n) {
		if(n == 2)
			return true;
		
	}
	
	private static void print(long[] arr) {
		Arrays.sort(arr);
		long q = arr[0];
		System.out.println(q+"\n");
		for(long p=2; p<Math.pow(10,10); p++) {
			if(p == 2 || p == 3)
			for(int i=1; i<arr.length; i++) {
				if(p % arr[i] == q) {
					if(i == arr.length) {
						System.out.println(p);
						break;
					}
					continue;
				}
				else {
					break;
				}
			}
		}
		
		System.out.println("None");
		
	}
	
	public static void main(String[] args) {
		long[] arr = {3, 4, 5, 1};
		print(arr);
	}
}
