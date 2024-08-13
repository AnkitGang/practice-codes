package Tries;

public class InsertionInTries {
	
	static void insert(String word) {
		TriesNode.Node current = TriesNode.root;
		
		for(int i=0; i<word.length(); i++) {
			int index = word.charAt(i) - 'a';  //Ascii Value  suppose c - a = 99-97 = 2 ..at index 2 c is present in array
			if(current.children[index] == null) {
				current.children[index] = new TriesNode.Node();
			}
			
			if(i == (word.length() - 1)) {
				current.children[index].isTerminal = true;
				System.out.println("Word Inserted: " + word);
			}
			
			current = current.children[index];
		}
	}
	
	public static void main(String[] args) {
		//insert("cat");
	}
}
 