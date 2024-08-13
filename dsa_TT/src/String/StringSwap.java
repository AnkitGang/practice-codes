package String;





//public class StringSwap {
//	public static String swap1(String s) {
//		String l = s.charAt(s.length()-1) + s.substring(1, s.length()-1) + s.charAt(0);
//		
//		return l;
//	}
//	
//	public static String swap2(String s) {
//		String s1 = s.substring(0, s.length()/2);
//		String s2 = s.substring(s.length()/2, s.length());
//		s = s2 + s1;
//		return s;
//	}
//	public static void main(String[] args) {
//		String s = "MERCER";
//		int[] arr = {1,1,2};
//		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] == 1) {
//				s = swap1(s);
//			}
//			else {
//				s = swap2(s);
//			}
//		}
//		
//		System.out.println(s);
//	}
//	
//}

public class StringSwap {
	public static String swap1(String s) {
		String l = s.charAt(s.length()-1) + s.substring(1, s.length()-1) + s.charAt(0);
		
		return l;
	}
	
	public static String swap2(String s) {
		String s1 = s.substring(0, s.length()/2);
		String s2 = s.substring(s.length()/2, s.length());
		s = s2 + s1;
		return s;
	}
	public String modifiedString(String input1, int input2, int[] input3) {
		
		for(int i=0; i<input2; i++) {
			if(input3[i] == 1) {
				input1 = swap1(input1);
			}
			else {
				input1 = swap2(input1);
			}
		}
		
		return input1;
	}
	
	public static void main(String[] args) {
		String s = "MERCER";
		int[] arr = {1,1,2};
		
		StringSwap r = new StringSwap();
		String s3 = r.modifiedString(s, 3, arr);
		System.out.println(s3);
	}
	
}
