package BitManipulation;

public class ClearLastKthBits {
	public static void main(String[] args) {
		int n = 12;
		int k = 3;
		
		//12 --> 1100
		//we want --> 1000  --> last three bits 0
		n = n >> k;
		n = n << k;
		
		System.out.println(n);
		
		//or we can do negation of 0 then left shift k times 
		//then perform & with n
		
		System.out.println(n & (~0 << k));
	}
}
