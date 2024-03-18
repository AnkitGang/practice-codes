package recursion;

public class SubsequenceOptimized {  //here we are not storing the values in any ArrayList..so if the input string is too long 
	public static void printSS(String ques, String ans) { //it wont lag due to high space consumption
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		char ch = ques.charAt(0);
		String resOfQues = ques.substring(1);
		
		printSS(resOfQues, ans + "");
		printSS(resOfQues, ans + ch);
	}
	
	public static void main(String[] args) {
		String str = "xyz";
		printSS(str, "");
	}
}
