package BinarySearchTree;

public class RemoveNodeInBST {
	static void removeNode(BSTNode<Integer> currentNode, BSTNode<Integer> parent, boolean isLeft, int data) {
		if(currentNode == null) {
			return;
		}
		//first search the element
		if(data > currentNode.data) {
			//look up in right
			removeNode(currentNode.right, currentNode, false, data);
		} 
		else if( data < currentNode.data) {
			removeNode(currentNode.left, currentNode, true, data);
		}
		else {
			//data found
			//CASE 1 -> Leaf Node(no left child, no right child)
			if(currentNode.left == null && currentNode.right == null) {
				if(isLeft) {
					parent.left = null;
				}
				else {
					parent.right = null;
				}
			}
			//CASE 2 -> left is null  but right child is present
			if(currentNode.left == null && currentNode.right != null) {
				if(isLeft) {
					parent.left = currentNode.right;
				}
				else {
					parent.right = currentNode.right;
				}
			}
			//CASE 3 -> left child is present but right is null
			if(currentNode.left != null && currentNode.right == null) {
				if(isLeft) {
					parent.left = currentNode.left;
				}
				else {
					parent.right = currentNode.left;
				}
			}
			//CASE 4 -> both left and right child are present
			if(currentNode.left != null && currentNode.right != null) {  //either find left Max OR right Minimum
				//Left Max
				int leftMax = BSTOperations.maxValue(currentNode.left);
				currentNode.data = leftMax;
				removeNode(currentNode.left, currentNode, true, leftMax);
				
				//Right Min
//				int rightMin = BSTOperations.minValue(currentNode.right);
//				currentNode.data = rightMin;
//				removeNode(currentNode.right, currentNode, false, rightMin);
			}
		}
	}
	
	public static void main(String[] args) {
		BSTOperations b = new BSTOperations();
		b.takeTreeValues();
		BSTNode<Integer> root = b.root;
		removeNode(root, root, false, 5);
		b.print(root);
	}
}
