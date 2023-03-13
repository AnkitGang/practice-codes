import java.util.*;

public class check_Permutation {
	public static int checkPermutation(String str1, String str2){
		if(str1.length() == str2.length()) {
			int[] arr = new int[130];
			
			//Putting 0 in whole array
			for(int i=32; i<=126; i++) {
				arr[i] = 0;
			}
			
			//adding 1 to indexes where it matches with the characters of str1
			//subtracting 1 from indexes where it matches with the characters of str2
			for(int j=0, k=0; j<str1.length(); j++, k++) {
				for(int i=32; i<=126; i++) {
					if(str1.charAt(j) == i) {
						arr[i] += 1;
					}
					if(str2.charAt(k) == i) {
						arr[i] -= 1;
					}
				}
			}
			
			//check if all the elements are 0 or not 
			for(int m=32; m<=126; m++) {
				if(arr[m] != 0) {
					return -1;
				}
			}
			return 0;
		}
		else {
			return -1;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Strings:");
		String str1 = sc.next();
		String str2 = sc.next();
		int ans = checkPermutation(str1, str2);
		if(ans == -1)
			System.out.println("No Permutation");
		else
			System.out.println("Permutation");
		
		sc.close();
	}
}
