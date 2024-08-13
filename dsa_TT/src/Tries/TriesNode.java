package Tries;

public class TriesNode {
	public static class Node{
		Node[] children;
		boolean isTerminal;
		
		public Node() {
			children = new Node[26];
			for(int i=0; i<26; i++) {
				children[i] = null;
			}
			
			isTerminal = false;
		}
	}
	
	static Node root = new Node();
}
