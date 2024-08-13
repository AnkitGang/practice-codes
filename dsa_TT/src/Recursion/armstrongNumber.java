package Recursion;

import java.util.Scanner;

public class armstrongNumber {
	public static void isArmstrong(int num, int ans, int sum, int digits) {  //Stack Build
		if(sum == ans) {
			System.out.println("true");
			return ;
		}
		
		if(num == 0) {
			System.out.println("false");
			return;
		}
		
		sum += (int)Math.pow(num % 10, digits);
		isArmstrong(num / 10, ans, sum, digits);
	}
	
	public static int isArmstrong(int num, int ans, int digits) {  //Stack Fall
		if(num == 0)
			return 0;
		
		int sum = isArmstrong(num / 10, ans, digits);
		
		return sum + (int)Math.pow(num % 10, digits);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digits = 0;
		int num = sc.nextInt();
		int n = num;
		while(n != 0) {
			n /= 10;
			digits++;
		}
		System.out.println(digits);
		isArmstrong(num, num, 0, digits);
		int res = isArmstrong(num, num, digits);
		if(res == num)
			System.out.println("true");
		else {
			System.out.println("false");
		}
		sc.close();
	}
}
