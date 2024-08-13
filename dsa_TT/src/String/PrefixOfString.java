package String;

public class PrefixOfString {
	public static String prefix(String str) {
		if(str.length() == 0)
			return "";
		
		System.out.println(str);
		return prefix(str.substring(1));
		
	}
	
	public static void main(String[] args) {
		String str = "apple";
		System.out.println("Prefix of " + str + " are : ");
		prefix(str);
	}
}
