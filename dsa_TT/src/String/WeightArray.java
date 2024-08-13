package String;

public class WeightArray {
	public static int[] computeWeight(String pattern) {
		int [] weightArray = new int[pattern.length()];
		int length = 0;
		int j = 1;
		
		weightArray[0] = 0;
		while(j < pattern.length()) {
			if(pattern.charAt(j) == pattern.charAt(length)) {
				length++;
				weightArray[j] = length;
				j++;
			}
			else {
				if(length != 0) {
					length = weightArray[length - 1];
				}
				else {
					weightArray[j] = 0;  //when new character comes put 0
					j++;
				}
			}
		}
		
		return weightArray;
	}
	
	public static void main(String[] args) {
		String str = "bababcbabcdab";
		int[] weight = computeWeight(str);
		for(int elem: weight)
			System.out.print(elem + " ");
		
		String str1 = "abacd";
		int[] weight1 = computeWeight(str1);
		for(int elem: weight1)
			System.out.print(elem + " ");
		
	}
}
