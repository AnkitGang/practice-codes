package recursion;

public class KeyPad {
	public static String[] keyPadSubsequences(int n) {
		if(n == 0) {
			String ans[] = {""};
		}
		int temp = n;
		int count = 0;
		while(temp != 0) {
			temp = temp/10;
			count++;
		}
		String str = Characters(n%10);
		String smallAns[] = keyPadSubsequences(n/10);
		for(int i = 0; i < str.length(); i++) {
			smallAns[i] = str.charAt(i);
		}
		
		
		
		//String[] smallAns2 = Characters(Integer.parseInt((keyPadSubsequences(n/10)));
		//String[] smallAns1 = keyPadSubsequences(n%10);
		//String helper = Characters(n%10);
		//String[] ans = new String[4 * smallAns2.length];
		
		/*for(int i=0; i<smallAns2.length; i++)
			ans[i] = smallAns2[i];
		
		for(int i=0; i<smallAns2.length; i++)
			ans[i+smallAns2.length] = helper.charAt(i) + smallAns2[i];
		*/
	}
	
	public static String Characters(int n) {
		switch(n) {
		case 2: return "abc";
		case 3: return "def";
		case 4: return "ghi";
		case 5: return "jkl";
		case 6: return "mno";
		case 7: return "pqrs";
		case 8: return "tuv";
		case 9: return "wxyz";
		default : break;
		}
		
		return "";
	}

	public static void main(String[] args) {
		int n = 234;
		String[] ans = keyPadSubsequences(n);
		for(int i=0; i<ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
}
