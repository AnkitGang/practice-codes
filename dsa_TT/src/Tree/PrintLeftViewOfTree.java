package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Queue.QueueUsingArray;

public class PrintLeftViewOfTree {
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
	
	int maxLevel = 0;
	void printLeftView(BinaryTreeNode<Integer> root, int currentLevel) {
		if(root == null) {
			return;
		}
		if(maxLevel < currentLevel) {
			System.out.println(root.data);
			maxLevel = currentLevel;
		}
		printLeftView(root.left, currentLevel + 1);
		printLeftView(root.right, currentLevel + 1);
	}
	
	void printLeftViewIterative(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int queueSize = queue.size();
			for(int i=0; i<queueSize; i++) {
				BinaryTreeNode<Integer> currNode = queue.poll();
				if(i==0) {
					System.out.println(currNode.data);
				}
				if(currNode.left != null) {
					queue.add(currNode.left);
				}
				if(currNode.right != null) {
					queue.add(currNode.right);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		PrintLeftViewOfTree p = new PrintLeftViewOfTree();
		p.insert();
		p.printLeftView(null, 1);
		
	}
}
