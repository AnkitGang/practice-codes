package tree;

public class numOfNodes {
	public int numNodes(TreeNode<Integer> root) {
		if(root == null)
			return 0;    		//this is NOT the BASE CASE...it is an EDGE CASE
		
		int count = 1;
		for(int i=0; i<root.children.size(); i++) {
			count += numNodes(root.children.get(i)); //this recursion does not require any base case as it gets automatically
		}											 //handled in for loop
		return count;
	}
	
	public static void main(String[] args) {
		numOfNodes n = new numOfNodes();
		
		TreeNode<Integer> root = TreeUse.takeInputLevelWise();
		
		System.out.println("Number of Nodes in given tree: " + n.numNodes(root));
	}
}
