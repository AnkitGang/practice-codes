package recursion;

import java.util.Scanner;

public class print_numbers {
	public static int print(int n) {
		if(n>0) {
			print(n-1);
			System.out.print(n + " ");
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		
		print(n);
		sc.close();
	}

}
