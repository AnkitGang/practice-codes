package BitManipulation;

public class ClearKthBit {
	public static void main(String[] args) {
		int n = 12;
		int k = 3;  //means clear the bit at kth position from last;  
		
		// 12--> 1100 
		//3rd bit is so after clear --> 1000
		//here also index starts from 0 so we do k-1
		System.out.println((n & ~(1 << k-1)));
	}
}
