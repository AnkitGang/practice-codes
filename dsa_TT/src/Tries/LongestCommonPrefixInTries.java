package Tries;

public class LongestCommonPrefixInTries {
	public static int commonPrefixLength(TriesNode.Node root) {
		int count = 0;
		int branch = 0;
		int index = 0;
		
		while(root.isTerminal != true) {
			branch = 0;   //coz every parent node can have different number of branches
			for (int i = 0; i < 26; i++) {
				if (root.children[i] != null) {
					index = i;  //we maintained index so that we can move to next node 
					branch++;
					if (branch > 1) {
						return count;
					}
				}
			}
			count++;
			root = root.children[index];
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		InsertionInTries.insert("ape");
		InsertionInTries.insert("ape");
		InsertionInTries.insert("ape");
		
		System.out.println(commonPrefixLength(TriesNode.root));
	}
}
