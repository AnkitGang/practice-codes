package tree;

import java.util.Scanner;

public class largestNode {
	public int largest(TreeNode<Integer> root) {
		if(root == null)			// this is also NOT the BASE CASE
			return Integer.MIN_VALUE;
		
		int ans = root.val;
		for(int i=0; i<root.children.size(); i++) {
			int childLargest = largest(root.children.get(i));
			if(childLargest > ans)
				ans = childLargest;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		largestNode l = new largestNode();
		Scanner sc = new Scanner(System.in);
		
		TreeNode<Integer> root = TreeUse.takeInputLevelWise();
		System.out.println("Largest Node: " + l.largest(root));
		
		sc.close();
	}

}
