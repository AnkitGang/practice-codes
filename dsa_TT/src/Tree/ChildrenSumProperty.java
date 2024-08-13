package Tree;

public class ChildrenSumProperty {
	static boolean isChildrenSum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		
		int sum =0;
		if(root.left != null) {
			sum += root.left.data;
		}
		if(root.right != null) {
			sum += root.right.data;
		}
		
		return (root.data == sum && isChildrenSum(root.left) && isChildrenSum(root.right));
	}
	
	
	public static void main(String[] args) {
		
	}
}
