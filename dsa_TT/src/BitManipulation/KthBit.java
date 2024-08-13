package BitManipulation;

public class KthBit {
	public static void main(String[] args) {
		int n = 12;
		
		int k = 2;
		
		System.out.println(((n >> k) & 1) == 1 ? 1 : 0);
		System.out.println(((n >> k-1) & 1) == 1 ? 1 : 0);
	}
}
