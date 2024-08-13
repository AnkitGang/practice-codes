package String;

public class StringToInteger {
	
	static int convertAtoI(String s) {
		int n = s.length();
		int sign = 1;
		int index = 0;
		int r = 0;
		
		//spaces
		while(index < n && s.charAt(index) == ' ') {
			index++;
		}
		
		//sign
		if(index < n && s.charAt(index) == '+') {
			sign = 1;
			index++;
		}
		else if(index < n && s.charAt(index) == '-') {
			sign = -1;
			index++;
		}
		
		while(index < n && Character.isDigit(s.charAt(index))) {
			int digit = s.charAt(index) - '0';
			
			if(r >= Integer.MAX_VALUE/10 || (r == Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE%10))
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			else if(r <= Integer.MIN_VALUE)
				return Integer.MIN_VALUE;
			
			r = 10 * r + digit;
			index++;
		}
		
		return r * sign;
		
		
//		s =s.replace(" ","");
//        int z = s.indexOf('-');
//        s = s.replaceAll("\\p{Punct}","");
//        int len = s.length();
//        if(len ==0)
//            return 0;
//        int i=1;
//        int res=0;
//        while(i<len && (s.charAt(i)>=48&&s.charAt(i)<=57)) {
//            char ch = s.charAt(i);
//            res=res*10+ (ch-'0');
//            i++;
//        }
//        res = z!=-1?-res:res;
//         res = (res > Integer.MAX_VALUE) ? Integer.MAX_VALUE : res;
//            res = (res < Integer.MIN_VALUE) ? Integer.MIN_VALUE : res;
//            return res;
  
	}
	
	public static void main(String[] args) {
		//conditions
		//1. 32-bit integer
		//2. remove blank space
		//3. Maintain (+, -)
		//4. 
		
		String str = "This is -49";
		System.out.println(convertAtoI(str));
	}
}
