package Recursion;

public class seriesSum {     //  1/1^1 + 2/2^2 + 3/3^3 + ----- + n/n^n
	public static void sumOfSeries(float n, float sum) {   //Stack Build
		if(n == 0) {
			System.out.println(sum);
			return;
		}
		sum += n/Math.pow(n, n);
		
		sumOfSeries(n - 1, sum);  //tail recursion
	}
	
	public static float sumOfSeries(float n) {   //Stack Fall
		if(n == 0)
			return 0;
		
		float s = sumOfSeries(n - 1);
		return s += n/(float)Math.pow(n, n);
	}
	
	public static void main(String[] args) {
		sumOfSeries(2, 0);
		System.out.println(sumOfSeries(3));
	}
}
