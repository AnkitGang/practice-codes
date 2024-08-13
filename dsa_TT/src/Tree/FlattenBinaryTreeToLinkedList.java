package Tree;

public class FlattenBinaryTreeToLinkedList {  //Leetcode 114
	
	BinaryTreeNode<Integer> prev = null;
	
    public void flatten(BinaryTreeNode<Integer> root) {
        if(root == null) return ;

        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
    
    
}
