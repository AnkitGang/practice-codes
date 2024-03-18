package tree;

import java.util.LinkedList;
import java.util.Queue;

public class ReplaceNodeWithDepth {
	public void replaceIterative(TreeNode<Integer> root) {
		if(root == null) return;
		int depth = 1;
		
		Queue<TreeNode<Integer>> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=0; i<size; i++) {
				TreeNode<Integer> curr = q.poll();
				curr.val = depth;
				
				for(int j=0; j<curr.children.size(); j++)
					q.add(curr.children.get(j));
			}
			depth++;
		}
	}
	
	public static void main(String[] args) {
		ReplaceNodeWithDepth r = new ReplaceNodeWithDepth();
		
		TreeNode<Integer> root = TreeUse.takeInputLevelWise();
		r.replaceIterative(root);
		TreeUse.printLevelWise(root);
	}
}