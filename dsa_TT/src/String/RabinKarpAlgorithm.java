package String;

public class RabinKarpAlgorithm {
	private static long HashValue(String pattern) {
		long hashValue = 0;
		for(int i=0; i<pattern.length(); i++) {
			hashValue += pattern.charAt(i) * Math.pow(10, i);
		}
		return hashValue;
	}
	
	private static int searchPattern(String text, String pattern) {
		int textLength = text.length();
		int patternLength = pattern.length();
		long patternHash = HashValue(pattern);
		
		for(int i=0; i<textLength - patternLength; i++) {
			long textHash = HashValue(text.substring(i, i+patternLength));
			if(patternHash == textHash)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String text = "ABABDABADCABAB";
		String pattern = "ABAD";
		
		int findIndex = searchPattern(text, pattern);
		System.out.println("Found at index: " + findIndex);
	}
}
