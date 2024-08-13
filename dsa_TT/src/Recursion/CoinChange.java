package Recursion;

public class CoinChange {
	public static int Ways(int [] coins, int amount, int index) {
		if(amount == 0)
			return 1;
		
		if(amount < 0)
			return 0;
		
		if(amount > 0 && index == coins.length)
			return 0;
		
		return Ways(coins, amount - coins[index], index) + Ways(coins, amount, index + 1);
			
	}
	
	public static void main(String[] args) {
		int[] coins = {1, 2};
		System.out.println("Number of ways: " + Ways(coins, 3, 0));
	}
}
