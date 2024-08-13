package Recursion;

public class countZeroes {
	public static void count(int num, int c) {  //Stack Build
		if(num == 0) {
			System.out.println(c);
			return;
		}
			
		if(num % 10 == 0)
			c++;
		
		count(num / 10, c);
	}
	
	public static int count0(int num) {   		//Stack Fall
		if(num == 0)
			return 0;
		
		if(num % 10  == 0)
			return 1 + count0(num / 10);
		else
			return count0(num / 10);
		
	}
	
	public static void main(String[] args) {
			count(102030, 0);
			System.out.println(count0(102030));
	}
}
