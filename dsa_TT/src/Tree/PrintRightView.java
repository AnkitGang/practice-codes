package Tree;

import java.util.Scanner;

public class PrintRightView {
	String nodeName = "root";
	Scanner sc = new Scanner(System.in);

	BinaryTreeNode<Integer> insert() {
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
	
	int maxLevel = 0;
	void printRightView(BinaryTreeNode<Integer> root, int currentLevel) {
		if(root == null) {
			return ;
		}
		if(maxLevel < currentLevel) {
			System.out.println(root.data);
			maxLevel = currentLevel;
		}
		printRightView(root.left, currentLevel + 1);
		printRightView(root.right, currentLevel + 1);
	}
	
	void printRightViewIterative(BinaryTreeNode<Integer> root) { //We can use stack instead of queue here
		
	}
	
	public static void main(String[] args) {
		PrintRightView p = new PrintRightView();
		p.insert();
		p.printRightView(null, 1);
	}
}
