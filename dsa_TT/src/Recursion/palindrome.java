package Recursion;

import java.util.Scanner;

public class palindrome {
	public static int reverse(int num, int temp) {  // Stack Fall 
		if(num == 0) 
			return temp;
		
		temp = (temp * 10) + (num % 10);
		return reverse(num / 10, temp);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int temp = reverse(num, 0);
		if(temp == num)
			System.out.println("true");
		else {
			System.out.println("false");
		}
		
		sc.close();
	}
}
