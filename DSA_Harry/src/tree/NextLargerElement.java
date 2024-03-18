package tree;

import java.util.LinkedList;
import java.util.Queue;

public class NextLargerElement {
	TreeNode<Integer> larger;
	public TreeNode<Integer> nextLarger(TreeNode<Integer> root, int k) {
		if(root == null) return root;
		
		Queue<TreeNode<Integer>> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=0; i<size; i++) {
				TreeNode<Integer> curr = q.poll();
				if((larger == null && curr.val > k) || (curr.val > k && curr.val < larger.val)) {
					larger = curr;
				}
				
				for(int j=0; j<curr.children.size(); j++)
					q.add(curr.children.get(j));
			}
		}
		return larger;
		
	}
	
	public static void main(String[] args) {
		NextLargerElement n = new NextLargerElement();
		
		TreeNode<Integer> root = TreeUse.takeInputLevelWise();
		TreeNode<Integer> ans = n.nextLarger(root, 6);
		if(ans == null)
			System.out.println("Not Present");
		else
			System.out.println(ans.val);
	}
}
