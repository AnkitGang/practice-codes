package tree;

import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

public class treeTraversal {
	
	// 1: Level Wise
	public void printLevelWise(TreeNode<Integer> root) {
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
	
	// 2: Pre Order
	public void preOrder(TreeNode<Integer> root) {
		if(root == null)
			return;
		
		System.out.print(root.val + " ");
		for(int i=0; i<root.children.size(); i++)
			preOrder(root.children.get(i));
	}
	
	// 3: Post Order 
	public void postOrder(TreeNode<Integer> root) {
		if(root == null)
			return;
		
		for(int i=0; i<root.children.size(); i++)
			postOrder(root.children.get(i));
		
		System.out.print(root.val + " ");
	}
	
	public static void main(String[] args) {
		treeTraversal t = new treeTraversal();
		TreeNode<Integer> root = TreeUse.takeInputLevelWise();
		
		t.printLevelWise(root);
		System.out.println();
		t.preOrder(root);
		System.out.println();
		t.postOrder(root);
		System.out.println();
	}
}
