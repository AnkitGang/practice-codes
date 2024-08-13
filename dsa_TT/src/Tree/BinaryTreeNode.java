package Tree;

public class BinaryTreeNode<T> {
	public T data;
	public BinaryTreeNode<T> left; // Left Child Reference
	public BinaryTreeNode<T> right; // Right Child Reference

	public BinaryTreeNode(T data) {
		this.data = data;
		// left and right default null
	}
}

