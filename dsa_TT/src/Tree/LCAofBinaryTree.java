package Tree;

import java.util.ArrayList;

public class LCAofBinaryTree {  //Lowest Common Ancestor
//	boolean search(BinaryTreeNode<Integer> root, int searchElement, ArrayList<BinaryTreeNode<Integer>> path) {
//		if(root == null) {
//			return false;
//		}
//		path.add(root);
//		if(root.data == searchElement) {
//			return true;
//		}
//		
//		if(search(root.left, searchElement, path) || search(root.right, searchElement, path)){
//			return true;
//		}
//		return false;
//	}
//	
//	public BinaryTreeNode<Integer> lca(BinaryTreeNode<Integer> root, int n1, int n2){
//		ArrayList<BinaryTreeNode<Integer>> path1 = new ArrayList<>();
//		ArrayList<BinaryTreeNode<Integer>> path2 = new ArrayList<>();
//		if(!search(root, n1, path1) || !search(root, n2, path2)) {
//			return null;
//		}
//		
//		for(int i=path1.size()-1; i>=0; i--) {
//			for(int j=path2.size()-1; j>=0; j--) {
//				if(path1.get(i) == path2.get(j)) {
//					return path1.get(i);
//				}
//			}
//		}
//		return null;
//	}
	
	public BinaryTreeNode<Integer> lowestCommonAncestor(BinaryTreeNode<Integer> root, int p, int q) {
        if(root == null || root.data==p || root.data==q){
            return root;
        }

        BinaryTreeNode<Integer> left = lowestCommonAncestor(root.left, p, q);
        BinaryTreeNode<Integer> right = lowestCommonAncestor(root.right, p, q);
        
        if(left == null) return right;
        else if(right == null) return left;
        else return root;
    }
	
	public static void main(String[] args) {
		LCAofBinaryTree l = new LCAofBinaryTree();
		PrintLeftViewOfTree p = new PrintLeftViewOfTree();
		BinaryTreeNode<Integer> root = p.insert();
		
		System.out.println(l.lowestCommonAncestor(root, 6, 4).data);
	}
	
}
