package Recursion;

public class sumOfNnaturalNumbers {
	public static void sum(int num, int res) {
		if(num == 0) {				//Stack Build
			System.out.println(res);
			return;
		}
		
		res += num;
		sum(num - 1, res);
	}
	
	public static int sum(int num) {   //Stack Fall
		if(num == 0)
			return 0;
		
		return num + sum(num - 1);
	}
	
	public static void main(String[] args) {
		sum(5, 0);
		System.out.println(sum(5));
	}
}
