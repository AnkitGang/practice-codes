package Tries;

public class SearchInTries {
	public static boolean search(String word) {
		TriesNode.Node current = TriesNode.root;
		
		for(int i=0; i<word.length(); i++) {
			int index = word.charAt(i) - 'a';  //Ascii Value  suppose c - a = 99-97 = 2 ..at index 2 c is present in array
			
			TriesNode.Node node = current.children[index];
			
			if(node == null) {
				return false;
			}
			
			if(i == word.length() - 1 && node.isTerminal == false) {
				System.out.println(word + " doesnt exist...");
				return false;
			}
			current = current.children[index];
		}
		
		return true;
	}
	
	public static void main(String[] args) {
//		InsertionInTries.insert("apple");
//		InsertionInTries.insert("bag");
//		InsertionInTries.insert("ball");
//		InsertionInTries.insert("cat");
//		
//		System.out.println(search("ball"));
//		System.out.println(search("bat"));
	}
}
