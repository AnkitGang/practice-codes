package BitManipulation;

public class IncrementBy1 {
	public static void main(String[] args) {
		//we know when we perform negation operation on positive number it increments by 1 with minus sign
		// ~5 --> -(5+1)   -->  -6 
		// ~n => -(n+1)
		
		int n = 5;
		System.out.println(-(~n));
	}
}
