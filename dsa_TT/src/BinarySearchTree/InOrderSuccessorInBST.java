package BinarySearchTree;

public class InOrderSuccessorInBST {   //GFG
	public BSTNode<Integer> inorderSuccessor(BSTNode<Integer> root, BSTNode<Integer> x) {
		BSTNode<Integer> successor = null;
		while(root != null){
			if(x.data >= root.data){
				root = root.right;
			}
			else{
				successor = root;
				root = root.left;
			}
		}
		return successor;     
    }
}
