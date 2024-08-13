package Tree;

public class SameTree {   //LeetCode 100.
	public boolean isSameTree(BinaryTreeNode<Integer> node1, BinaryTreeNode<Integer> node2) {
        if (node1 == null && node2 == null)
			return true;
		
        if(node1 == null || node2 == null || node1.data != node2.data) 
			return false;
		
        return isSameTree(node1.left, node2.left) && isSameTree(node1.right, node2.right);
    }
}
