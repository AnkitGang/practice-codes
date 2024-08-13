package BinarySearchTree;

class BSTOperations{
	BSTNode<Integer> root; //root is null
	
	void takeTreeValues() {
		root = insert(root, 10);
		BSTNode<Integer> t = insert(root, 20);
		t = insert(root, 5);
		t = insert(root, 3);
		t = insert(root, 7);
		t = insert(root, 12);
		t = insert(root, 23);
		
		print(root);
		BSTNode<Integer> node = search(root, 5);
		System.out.println(node.data + " " + node == null ? "Not Found" : "Found");
		System.out.println("Min Value " + minValue(root));
		System.out.println("Max Value " + maxValue(root));
	}
	
	BSTNode<Integer> insert(BSTNode<Integer> currentNode, int data) {
		//check root is not present
		if(currentNode == null) {
			currentNode = new BSTNode<Integer>(data);
			return currentNode;
		}
		//root is present
		if(data < currentNode.data) {
			currentNode.left = insert(currentNode.left, data);
		}
		else if(data > currentNode.data) {
			currentNode.right = insert(currentNode.right, data);
		}
		return currentNode;
	}
	
	void print(BSTNode<Integer> currentNode) {
		if(currentNode != null) {
			print(currentNode.left);
			System.out.println(currentNode.data);
			print(currentNode.right);
		}
	}
	
	BSTNode<Integer> search(BSTNode<Integer> currentNode, int dataToSearch){
		if(currentNode == null || currentNode.data == dataToSearch) {
			return currentNode;
		}
		if(currentNode.data > dataToSearch) {
			return search(currentNode.left, dataToSearch);
		}
		else {
			return search(currentNode.right, dataToSearch);
		}
	}
	
	public static int minValue(BSTNode<Integer> currentNode) {
		if(currentNode == null || currentNode.left == null) {
			return currentNode.data;
		}
		
		int min = Integer.MIN_VALUE;
		while(currentNode.left != null) {
			min = currentNode.left.data;
			currentNode = currentNode.left;
		}
		return min;
	}
	
	public static int maxValue(BSTNode<Integer> currentNode) {
		if(currentNode == null || currentNode.right == null) {
			return currentNode.data;
		}
		
		int max = Integer.MAX_VALUE;
		while(currentNode.right != null) {
			max = currentNode.right.data;
			currentNode = currentNode.right;
		}
		return max;
	}
	
	public static void main(String[] args) {
		BSTOperations b = new BSTOperations();
		b.takeTreeValues();
	}
}