package Recursion;

public class primeNumber {
	public static void isPrime(int num, boolean ans, int i) {  //Stack Build
		if(num == 1) {   //Edge Case
			System.out.println("1 is neither prime nor composite.");
			return ;
		}
		
		if(i > num / 2) {
			System.out.println(ans);
			return ;
		}
		
		if(num % i == 0) {
			ans = false;
			System.out.println(ans);
			return ;
		}
			
		isPrime(num, ans, i+1);
	}
	
	public static boolean isPrime(int num, int i) {
		if(num == 1) {   //Edge Case
			System.out.println("1 is neither prime nor composite.");
			return false;
		}
		
		if(num <= 2)
			return (num == 2) ? true : false; 
		
		isPrime(num, i+1);
	}
	
	public static void main(String[] args) {
		isPrime(2, true, 2);
		System.out.println(isPrime(5, 5));
	}
}
