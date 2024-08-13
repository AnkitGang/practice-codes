package Array;

public class StockBuyAndSell {
	public static void main(String[] args) {
		int[] prices = {100, 180, 260, 310, 40, 535, 695};
		int maxProfit = 0;
		
		//start from day 1
		for(int i=1; i<prices.length; i++) {
			if(prices[i] > prices[i-1]) {
				maxProfit += prices[i] - prices[i-1];
			}
		}
		
		System.out.println("Max Profit: " + maxProfit);
	}
}
