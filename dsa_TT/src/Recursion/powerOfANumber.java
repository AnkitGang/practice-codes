package Recursion;

public class powerOfANumber {
	public static void power(int num, int pow, int res) {   //During stack build
		if(pow == 0) {			//termination condition	
			System.out.println(res);						
			return;											
		}													
		
		res = res * num;		 //business logic
		power(num, pow-1, res);  //tail recursion
	}
	
	public static int power(int num, int pow) {  // During stack fall
		if(pow == 0)
			return 1;
		
		int res = power(num, pow-1);
		return res * num;
	}
	
	public static void main(String[] args) {
		power(5, 5, 1);
		System.out.println(power(5, 5));
	}
}
