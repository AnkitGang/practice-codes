package Tree;

public class HeightOfBinaryTree {
	static int recursiveHeight(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0; //empty tree height is 0
		}
		int leftHeight = recursiveHeight(root.left);
		int rightHeight = recursiveHeight(root.right);
		int value = Math.max(leftHeight, rightHeight);
		return value+1;
	}
	
	public static void main(String[] args) {
		BinaryTreeTraversalRecursion b = new BinaryTreeTraversalRecursion();
		BinaryTreeNode<Integer> root = b.insert();
		System.out.println("Height: " + recursiveHeight(root));
	}
}
