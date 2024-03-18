package recursion;
import java.util.*;

public class tower_of_hanoi {
	
	public static void hanoi(int n, char from_rod, char to_rod, char helper_rod) {
		if(n == 0) {
			return;
		}
		
		hanoi(n-1, from_rod, helper_rod, to_rod);
		System.out.println(from_rod + " " + to_rod);
		hanoi(n-1, helper_rod, to_rod, from_rod);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of disks: ");
		int n = sc.nextInt();
		
		hanoi(n, 'a', 'c', 'b');
		
		sc.close();
	}
}


