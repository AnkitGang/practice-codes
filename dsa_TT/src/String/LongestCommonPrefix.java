package String;

public class LongestCommonPrefix {
	private static int minLen(String[] arr, int n) {
		int min = arr[0].length();
		for(int i=1; i < n; i++) {
			if(min > arr[i].length())
				min = arr[i].length();
		}
		return min;
	}
	
	private static String commonPrefix(String [] arr, int n) {
		int minLength = minLen(arr, n);
		
		String ans = "";
		for(int i=0; i<minLength; i++) {
			char curr = arr[0].charAt(i);
			for(int j=1; j<n; j++) {
				if(arr[j].charAt(i) != curr)
					return ans;
			}
			ans += curr;
		}
		
		if(ans.isEmpty()) {
			System.out.println("No Common Prefix");
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String[] arr = {"lists", "listens", "like", "lies"};
		int n = arr.length;
		System.out.println(commonPrefix(arr, n));
	}
}
