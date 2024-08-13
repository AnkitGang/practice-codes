package Tree;

import java.util.Scanner;

public class BinaryTreeExample {
	public static void main(String[] args) {
		BinaryTreeTraversalRecursion b = new BinaryTreeTraversalRecursion();
		Scanner sc = new Scanner(System.in);
		BinaryTreeNode<Integer> root = null;
		while (true) {
			System.out.println("Binary tree operations:");
			System.out.println("1. Insert");
			System.out.println("2. PRint");
			System.out.println("3. Print Pre Order");
			System.out.println("4. Print Post Order");
			System.out.println("5. Print In Order");
			System.out.println("Enter choice:");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				root = b.insert();
				break;
			case 2:
				b.printTree(root);
				break;
			case 3:
				b.preOrder(root);
				break;
			case 4: 
				b.postOrder(root);
				break;
			case 5:
				b.inOrder(root);
				break;
			default:
				System.exit(0);
			}
		}
	}
}
