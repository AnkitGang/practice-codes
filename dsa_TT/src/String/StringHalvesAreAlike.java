package String;

public class StringHalvesAreAlike {  //LeetCode 1704
	public static boolean halvesAreAlike(String s) {
        String a =  s.substring(0, s.length()/2);
        String b = s.substring(s.length()/2, s.length());

        if(countVowels(a) == countVowels(b)){
            return true;
        }        
        return false;
    }

    private static int countVowels(String a){
        int count = 0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u' || a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O' || a.charAt(i) == 'U'){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
		String str = "book";
		String str1 = "textbook";
		String str2 = "leetcode";
		String str3 = "mobile";
		
		System.out.println(str + "->" + halvesAreAlike(str));
		System.out.println(str1 + "->" + halvesAreAlike(str1));
		System.out.println(str2 + "->" + halvesAreAlike(str2));
		System.out.println(str3 + "->" + halvesAreAlike(str3));
	}
}
