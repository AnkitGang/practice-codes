package TreeRecursion;

public class simpleTree {
	public static void branch(int x) {
		if(x >= 3)
			return;
		
		System.out.println(x);
		branch(x+1);
		branch(x+2);
	}
	
	public static void main(String[] args) {
		branch(0);
	}
}
