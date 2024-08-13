package Tree;

public class MergeTwoBinaryTrees {  //leetcode 617
	public BinaryTreeNode<Integer> mergeTrees(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {
        if(root1 == null) return root2;
        if(root2 == null) return root1;
        
        root1.data += root2.data;
        
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        
        return root1;
    }
}
