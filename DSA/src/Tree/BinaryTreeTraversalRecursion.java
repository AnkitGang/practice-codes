package Tree;

import java.util.Scanner;

public class BinaryTreeTraversalRecursion {
	String nodeName = "root";
	Scanner sc = new Scanner(System.in);

	public BinaryTreeNode<Integer> insert() {
		System.out.println("Enter the " + nodeName + " Data or enter -1 to exit.");
		int data = sc.nextInt();
		if (data == -1) {
			return null;
		}
		// if data coming correct
		// prepare a node
		BinaryTreeNode<Integer> node = new BinaryTreeNode<>(data);
		// Prepare a left node (DFT)
		nodeName = "left";
		node.left = insert();
		// BackTrack
		nodeName = "right";
		node.right = insert();
		// BackTrack
		nodeName = "root";
		return node;
	}

	void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		// Branch Recursion
		// DFT
		String result = "";
		result += root.data + "->";
		// checking current node left exist
		if (root.left != null) {
			result += " Left " + root.left.data;
		}
		if (root.right != null) {
			result += " Right " + root.right.data;
		}
		System.out.println(result);
		printTree(root.left);
		printTree(root.right);
	}
	
	//DFT
	//Pre Order
	void preOrder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return ;
		}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	//DFT
	//In Order
	void inOrder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return ;
		}
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	
	//DFT
	//In Order
	void postOrder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return ;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
	
	public static void main(String[] args) {
		BinaryTreeTraversalRecursion b = new BinaryTreeTraversalRecursion();
		BinaryTreeNode<Integer> root = b.insert();
		b.inOrder(root);
	}
}
