package BitManipulation;

public class FindXORwithoutXOR {
	public static void main(String[] args) {
		
		//Some formula
		// (a | b) - (a & b)
		// (~a & b) | (~b & a)
		
		
		// 5 ^ 6
		System.out.println((5 & ~6) + (~5 & 6));
		
		// 7 ^ 1
		System.out.println((7 & ~1) + (~7 & 1));
	}
}
