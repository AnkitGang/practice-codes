package tree;

import java.util.ArrayList;

public class TreeNode<T> {
	public T val;
	public ArrayList<TreeNode<T>> children;
	
	public TreeNode(T val) {
		this.val = val;
		children = new ArrayList<>();
	}
}
