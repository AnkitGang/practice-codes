package Tries;

public class SuffixInsertInTries {
	public static void insertSuffix(String word) {		
		for(int i=0; i<word.length(); i++) {		
			InsertionInTries.insert(word.substring(i));
		}
	}
	
	public static void main(String[] args) {
		insertSuffix("word");
	}
}
