package Tree;

import java.util.*;

public class BinaryTreeTraversalIterative {
	public BinaryTreeNode<Integer> insert() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root data: ");
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(sc.nextInt());
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = q.poll();
			
			System.out.println("Enter left child of " + frontNode.data + "   (-1 to skip)");
			int leftChild = sc.nextInt();
			if(leftChild != -1) {
				frontNode.left = new BinaryTreeNode<Integer>(leftChild);
				q.add(frontNode.left);
			}
			else {
				frontNode.left = null;
			}
			
			System.out.println("Enter right child of " + frontNode.data + "   (-1 to skip)");
			int rightChild = sc.nextInt();
			if(rightChild != -1) {
				frontNode.right = new BinaryTreeNode<Integer>(rightChild);
				q.add(frontNode.right);
			}
			else{
				frontNode.right = null;
			}
		}
		
		sc.close();
		return root;
	}
	
	public static void preOrderTreeTraversal(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		
		//Prepare a stack
		Stack<BinaryTreeNode<Integer>> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			BinaryTreeNode<Integer> currentNode = stack.pop();
			System.out.print(currentNode.data + " ");
			//Now push right and the left
			if(currentNode.right != null) {
				stack.push(currentNode.right);
			}
			if(currentNode.left != null) {
				stack.push(currentNode.left);
			}
		}
	}
	
	//optimized
	public static void preOrderTreeTraversalOptimize(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		
		//Prepare a stack
		Stack<BinaryTreeNode<Integer>> stack = new Stack<>();
		BinaryTreeNode<Integer> currentNode = root;
		while(currentNode != null || !stack.isEmpty()) {
			while(currentNode != null) {
				System.out.print(currentNode.data + " ");
				if(currentNode.right != null) {
					stack.push(currentNode.right);
				}
				currentNode = currentNode.left;
			}
			if(!stack.isEmpty()) {
				//get the right node
				currentNode = stack.pop();
			}
		}
		System.out.println();
	}
	
	public static void iterativeInOrder(BinaryTreeNode<Integer> root) {
		Stack<BinaryTreeNode<Integer>> stack = new Stack<>();
		BinaryTreeNode<Integer> currentNode = root;
		while(currentNode != null || !stack.isEmpty()){
			while(currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.left;
			}
			currentNode = stack.pop();
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.right;
		}
	}
	
//	public static void iterativePostOrder(BinaryTreeNode<Integer> root) {
//		Stack<BinaryTreeNode<Integer>> stack = new Stack<>();
//		BinaryTreeNode<Integer> currentNode = root;
//		while(currentNode != null || !stack.isEmpty()){
//			while(currentNode != null) {
//				stack.push(currentNode);
//				currentNode = currentNode.left;
//			}
//			currentNode = stack.pop();
//			System.out.print(currentNode.data + " ");
//			currentNode = currentNode.right;
//			
//		}
//	}
	
	public static void levelOrder(BinaryTreeNode<Integer> root) {
		LinkedList<BinaryTreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			//Remove first element from queue
			BinaryTreeNode<Integer> node = queue.removeFirst();
			System.out.print(node.data + " ");
			//Put parent left and right in queue
			if(node.left != null) {
				queue.addLast(node.left);
			}
			if(node.right != null) {
				queue.addLast(node.right);
			}
		}
	}
	
	public static void levelOrder2(BinaryTreeNode<Integer> root) {
		LinkedList<BinaryTreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			//Remove first element from queue
			int countQueue = queue.size();
			for(int i=0; i<countQueue; i++) {
				BinaryTreeNode<Integer> currentNode = queue.poll();
				System.out.print(currentNode.data + " ");
				if(currentNode.left != null) {
					queue.addLast(currentNode.left);
				}
				if(currentNode.right != null) {
					queue.addLast(currentNode.right);
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		BinaryTreeTraversalIterative bt = new BinaryTreeTraversalIterative();
		bt.insert();
		
//		BinaryTreeTraversalRecursion b = new BinaryTreeTraversalRecursion();
//		Scanner sc = new Scanner(System.in);
//		BinaryTreeNode<Integer> root = null;
//		while (true) {
//			System.out.println();
//			System.out.println("Binary tree operations:");
//			System.out.println("1. Insert");
//			System.out.println("2. Iterative Pre Order");
//			System.out.println("3. Optimized Iterative Pre Order");
//			System.out.println("4. Optimized Iterative In Order");
//			System.out.println("5. Optimized Iterative level Order");
//			System.out.println("6. Optimized Iterative Level Order 2");
//			System.out.println("Enter choice:");
//			int choice = sc.nextInt();
//			
//			switch (choice) {
//			case 1:
//				root = b.insert();
//				break;
//			case 2:
//				preOrderTreeTraversal(root);
//				break;
//			case 3:
//				preOrderTreeTraversalOptimize(root);
//				break;
//			case 4:
//				iterativeInOrder(root);
//				break;
//			case 5:
//				levelOrder(root);
//				break;
//			case 6:
//				levelOrder2(root);
//				break;
//			default:
//				System.exit(0);
//			}
//		}
	}
}
