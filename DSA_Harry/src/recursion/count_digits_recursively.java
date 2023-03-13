package recursion;

import java.util.Scanner;

public class count_digits_recursively {
	public static int count(int n) {
		if(n/10 == 0) {
			return 1;
		}
		
		return 1 + count(n/10);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		
		System.out.println(count(n));
		sc.close();
	}
}
