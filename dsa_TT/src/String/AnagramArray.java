package String;

import java.util.Arrays;

public class AnagramArray {
	private static void sort(String[] wordsArray) {
		String[] words = wordsArray.clone();
		int index = 0;
		
		for(String word : words) {
			char[] arr = word.toCharArray();
			Arrays.sort(arr);
			words[index] = String.valueOf(arr);
			index++;
		}
		
		for(int i=0; i<words.length; i++) {
			if((i < words.length-1) && words[i].equals(words[i+1])) {
				System.out.println(wordsArray[i] + " " + wordsArray[i+1]);
			}
		}
			
	}
	
	public static void main(String[] args) {
		String[] arr = {"cat", "dog", "act","god"};
		sort(arr);
	}
}
