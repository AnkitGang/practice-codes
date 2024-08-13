package Tries;

public class PrefixInsertInTries {
	public static void insertPrefix(String word) {
		for(int i=0; i <= word.length(); i++) {
			InsertionInTries.insert(word.substring(0, i));
		}
	}
	
	public static void main(String[] args) {
		insertPrefix("word");
	}
}
