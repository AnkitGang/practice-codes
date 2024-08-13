package BitManipulation;

public class OddEven {  // LSB is always 1 for Odd and 0 for Even
	public static void main(String[] args) {
		int n = 6;
		System.out.println((n & 1) == 1 ? "odd" : "even");
	}

}
