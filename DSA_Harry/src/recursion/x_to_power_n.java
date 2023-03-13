package recursion;

import java.util.Scanner;

public class x_to_power_n {
	public static int power(int x, int n) {
		if(n == 0) {
			return 1;
		}
		n--;
		return x*power(x, n--);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x and n:");
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		if(x == 0) {
			System.out.println("Answer: 0");
			System.exit(0);
		}
		
		System.out.println("Answer: " + power(x, n));
		sc.close();
	}
}
