package recursion;

import java.util.*;

public class count_zeroes {
	
	public static int count(int n, int x) {
		if(n/10 <= 0) {
			return x;
		}
		else if(n%10 == 0) {
			x++;
		}
		
		return count(n/10, x);
	}
	
	public static int count(int n) {
		int x = 0;
		return count(n, x);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		System.out.println(count(n));

		sc.close();
	}

}
