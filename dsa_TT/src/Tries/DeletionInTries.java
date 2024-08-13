package Tries;

public class DeletionInTries {
	public static void delete(String word) {
		TriesNode.Node current = TriesNode.root;
		
		for(int i=0; i<word.length(); i++) {
			int index = word.charAt(i) - 'a';  //Ascii Value  suppose c - a = 99-97 = 2 ..at index 2 c is present in array
			
			TriesNode.Node node = current.children[index];
			
			if(i == word.length() - 1 && node.isTerminal == true) {
				node.isTerminal = false;
				System.out.println(word + " deleted from tries.");
				return ;
			}
			current = current.children[index];
		}
	}
	
	public static void main(String[] args) {
		InsertionInTries.insert("bag");
		InsertionInTries.insert("ball");
		
		System.out.println(SearchInTries.search("bag"));
		delete("bag");
		
		System.out.println();
		System.out.println(SearchInTries.search("bag"));
	}
}
