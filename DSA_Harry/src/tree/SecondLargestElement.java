package tree;

import java.util.LinkedList;
import java.util.Queue;

public class SecondLargestElement {
	public TreeNode<Integer> secondLargest(TreeNode<Integer> root) {
		if(root == null) return root;
		
		TreeNode<Integer> firstLarge = root;
		TreeNode<Integer> secondLarge = null;
		
		Queue<TreeNode<Integer>> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=0; i<size; i++) {
				TreeNode<Integer> curr = q.poll();
				if(curr.val > firstLarge.val) {
					secondLarge = firstLarge;
					firstLarge = curr;
				}
				else if(curr.val < firstLarge.val && curr.val > secondLarge.val) {
					secondLarge = curr;
				}
				
				for(int j=0; j<curr.children.size(); j++)
					q.add(curr.children.get(j));
			}
		}
		return secondLarge;
	}
	
	public static void main(String[] args) {
		SecondLargestElement s = new SecondLargestElement();
		
		TreeNode<Integer> root = TreeUse.takeInputLevelWise();
		TreeNode<Integer> ans = s.secondLargest(root);
		if(ans == null)
			System.out.println("Not Present");
		else
			System.out.println(s.secondLargest(root).val);
	}
}
