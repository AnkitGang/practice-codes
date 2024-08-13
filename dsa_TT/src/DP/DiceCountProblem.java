package DP;

public class DiceCountProblem {
	static int countWaysMemoization(int current, int target, int[] cache	) {
		//Positive base case
		if(current == target) {
			return 1;
		}
		//Negative base case
		if(current > target) {
			return 0;
		}
		
		if(cache[current] != 0) {
			return cache[current];
		}
		int count = 0;
		for(int dice = 1; dice <= 6; dice++) {
			count = count + countWaysRecursion(current + dice, target);
		}
		cache[current] = count;
		return count;
	}
	
	static int countWaysRecursion(int current, int target) {
		//Positive base case
		if(current == target) {
			return 1;
		}
		//Negative base case
		if(current > target) {
			return 0;
		}
		int count = 0;
		for(int dice = 1; dice <= 6; dice++) {
			count = count + countWaysRecursion(current + dice, target);
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int n = 10;
		int[] cache = new int[n+1];
		System.out.println(countWaysRecursion(0, n));
		System.out.println(countWaysMemoization(0, n, cache));
	}
}
