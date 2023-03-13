package recursion;
import java.util.*;

public class multiplication {
	
	private static int mul(int m, int n, int ans) {
		if(n == 0) {
			return ans;
		}
		else if(n > 0) {
			ans += m;
		}
		return mul(m, n-1, ans);	
	}
	
	public static int mul(int m, int n) {
		int ans = 0;
		return mul(m, n, ans);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter m and n: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println("Ans : " + mul(m, n));
		sc.close();
	}

}
