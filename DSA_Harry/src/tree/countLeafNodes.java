package tree;

public class countLeafNodes {
	int count = 0;
	public int countLeaf(TreeNode<Integer> root) {
		if(root == null)
			return 0;
		
		if(root.children.size() == 0)
			return 1;
		
		for(int i=0; i<root.children.size(); i++) {
			count += countLeaf(root.children.get(i));
		}
		
		return count;
	}

	public static void main(String[] args) {
		countLeafNodes cl = new countLeafNodes();
		TreeNode<Integer> root = TreeUse.takeInputLevelWise();
		
		System.out.println(cl.countLeaf(root));
	}

}
