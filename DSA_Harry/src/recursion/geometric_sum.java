package recursion;
import java.util.*;

public class geometric_sum {
	
	public static double sum(int n) {
		if(n == 0) {
			return 1;
		}
		double ans = 1/Math.pow(2, n) + sum(n-1);
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		System.out.println(sum(n));
		
		sc.close();
	}

}
