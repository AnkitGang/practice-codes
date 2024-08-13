package Tree;

public class SizeOfBinaryTree { //no of nodes
	public int size(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int counter =1 ;
		counter += size(root.left);
		counter += size(root.right);
		return counter;
	}
}
