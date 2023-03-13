package recursion;
import java.util.*;

public class sum_of_digits {
	
	public static int sum(int number) {
		if(number/10 <= 0) {
			return number%10;
		}
		
		return number%10 + sum(number/10);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = sc.nextInt();

		System.out.println(sum(number));
		
		sc.close();
	}

}
