package tree;

import java.util.Scanner;

import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

public class TreeUse {
	
	public static TreeNode<Integer> takeInputDepthWise(Scanner sc){   //Using RECURSION
		int n;												 //DEPTH-WISE
		
		System.out.println("Enter next node data");
		n = sc.nextInt();
		TreeNode<Integer> root = new TreeNode<>(n);
		System.out.println("Enter number of children for " + n);
		int childCount = sc.nextInt();
		for(int i=0; i<childCount; i++) {
			TreeNode<Integer> child = takeInputDepthWise(sc);
			root.children.add(child);
		}
		
		return root;
	}
	
	public static void printDepthWise(TreeNode<Integer> root) {
		String s = root.val + ":";
		for(int i=0; i<root.children.size(); i++)
			s += root.children.get(i).val + ",";
		
		System.out.println(s);
		for(int j=0; j<root.children.size(); j++)
			printDepthWise(root.children.get(j));
	}
	
	
	
	public static TreeNode<Integer> takeInputLevelWise(){   //LEVEL-WISE
		Scanner sc = new Scanner(System.in);				//USES QUEUE
		
		System.out.println("Enter root data");
		int rootVal = sc.nextInt();
		TreeNode<Integer> root = new TreeNode<>(rootVal);
		
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Enter num of children of " + frontNode.val);
				int childNum = sc.nextInt();
				for(int i=0; i<childNum; i++) {
					System.out.println("Enter " + (i+1) + "th child of " + frontNode.val);
					int child = sc.nextInt();
					TreeNode<Integer> childNode = new TreeNode<>(child);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			} 
			catch (QueueEmptyException e) {
				//will never reach here 
				return null;
			}
		}
		
		return root;
	}
	
	public static void printLevelWise(TreeNode<Integer> root) {
		String s = "";
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				s = frontNode.val + ": ";
				for(int i=0; i<frontNode.children.size(); i++) {
					s += frontNode.children.get(i).val + ", ";
					pendingNodes.enqueue(frontNode.children.get(i));
				}
			} catch (QueueEmptyException e) {
				//never reach here
				
			}
			System.out.println(s);
		}
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		TreeNode<Integer> root = takeInputDepthWise(sc);   //TRY GIVING INPUT --> 4 2 1 0 2 0 -OR- 1 2 2 2 4 2 6 0 7 0 5 0 3 0
		printDepthWise(root);
		
//		TreeNode<Integer> root = takeInputLevelWise();
//		printLevelWise(root);
		   
		
		
		
//		TreeNode<Integer> root = new TreeNode<>(4);
//		TreeNode<Integer> node1 = new TreeNode<>(2);
//		TreeNode<Integer> node2 = new TreeNode<>(3);
//		TreeNode<Integer> node3 = new TreeNode<>(5);
//		TreeNode<Integer> node4 = new TreeNode<>(6);
//		
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		node2.children.add(node4);
//		
//		System.out.println(root);
	}
}
