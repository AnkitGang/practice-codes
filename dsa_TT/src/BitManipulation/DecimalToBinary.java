package BitManipulation;

public class DecimalToBinary {
	private static String decToBin(int num) {
		StringBuilder ans = new StringBuilder();
		while(num > 0) {
			int bit = num & 1;  //output is 0 if number is even and 1 if odd
			ans.append(bit);
			num = num >> 1;
		}
		
		return ans.reverse().toString();
	}
	
	public static void main(String[] args) {
		int num = 9;
		System.out.println(decToBin(num));
	}
}
