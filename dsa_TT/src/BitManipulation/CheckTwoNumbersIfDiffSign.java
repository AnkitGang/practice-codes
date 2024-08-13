package BitManipulation;

public class CheckTwoNumbersIfDiffSign {
	public static void main(String[] args) {
		int n = -85;
		int m = -5;
		System.out.println((n ^ m) < 0 ? "different": "same");
	}
}
