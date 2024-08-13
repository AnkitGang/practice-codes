package String;

public class SuffixString {
	public static void suffix(String str) {
		if(str.length() == 0)
			return ;
		
		suffix(str.substring(1));
		System.out.println(str + " ");
	}
	
	public static void main(String[] args) {
		String str = "apple";
		System.out.println("Suffix of " + str + " are : ");
		suffix(str);
	}
}
