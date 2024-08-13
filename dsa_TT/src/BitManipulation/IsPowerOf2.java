package BitManipulation;

public class IsPowerOf2 {
	public static void main(String[] args) {
		int n = 16;
		
		//n --> 16 --> 10000
		//n-1-->15 --> 01111
		//n & n-1 --> 00000  ...so power of 2
		
		System.out.println((n & n-1) == 0 ? "power of 2" : "not power of 2");
	}
}
