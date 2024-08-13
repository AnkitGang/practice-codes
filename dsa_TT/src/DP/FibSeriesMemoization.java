package DP;

public class FibSeriesMemoization {
	static int fibRecursion(int n) {
		if(n <= 1) {
			return n;
		}
		
		int first = fibRecursion(n - 1);
		int second = fibRecursion(n - 2);
		return first + second;
	}
	
	//Memoization
	static int fibMemoization(int n, int[] cache) {   //Top down approach
		if(n <= 1) {
			return  n;
		}
		
		if(cache[n] != 0) {
			return cache[n];
		}
		int first = fibMemoization(n - 1, cache);
		int second = fibMemoization(n - 2, cache);
		int result = first + second;
		cache[n] = result;
		return cache[n];
	}
	
	public static void main(String[] args) {
		int n =30;
		
		long start = System.currentTimeMillis();
		int res = fibRecursion(n);
		long end = System.currentTimeMillis();
		long total = end - start;
		
		System.out.println("Time Taken from Recursion: " + total);
		System.out.println("Result from Recursion: " + res);
		
		int[] cache = new int[n+1];
		
		start = System.currentTimeMillis();
		res = fibMemoization(n, cache);
		end = System.currentTimeMillis();
		total = end - start;
		
		System.out.println();
		System.out.println("Time Taken from Recursion: " + total);
		System.out.println("Result from Memoization: " + res);
	}
}
