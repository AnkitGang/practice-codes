import java.util.*;

public class compress_string {
	public static void compressString(String str) {
		char[] string = str.toCharArray();
		ArrayList<String> arr = new ArrayList<>();
		
		for(int i=0; i<str.length(); i++) {
			int count=1;
			if(string[i] != ' ') {
				for(int j=i+1; j<str.length(); j++) {
					if(string[i] == string[j] && string[i] != ' ') {
						count++;
						string[j] = ' ';
					}
				}
				String s = Character.toString(string[i]);
				arr.add(s);
				arr.add(String.valueOf(count));
			}
			
		}
		for(int k=0; k<arr.size(); k++) {
			System.out.print(arr.get(k));
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter String:");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		compressString(str);
		sc.close();
	}
}
