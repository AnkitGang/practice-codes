package BitManipulation;

public class MultiplyBy2point5 {
	public static void main(String[] args) {
		// 10 << 1 = 20
		// 10 >> 1 = 5
		// add them
		
		// by 2.5
		int n = 10;
		System.out.println((n << 1) + (n >> 1));
		System.out.println((n + n) + (n / 2));
		
		// multiply by 4.5
		System.out.println((n << 2) + (n >> 1));
		
		// 8.5
		System.out.println((n << 3) + (n >> 1));
	}
}
