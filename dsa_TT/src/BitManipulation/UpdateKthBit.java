package BitManipulation;

public class UpdateKthBit {
	public static void main(String[] args) {
		//1. Clear that bit
		//2. Then Update that bit 
		//becoz if we do OR operation with 1 it will always be 1
		
		int n = 12;
		int k = 2;
		int setBit = 1;
		
		n = n & ~(1 << k-1);
		
		System.out.println(n | (setBit << k-1));
	}
}
