package tree;

import java.util.Scanner;

public class maxChildrenNodeSum {
	int maxNodeSum = 0;
	TreeNode<Integer> maxSumNode;
	public void maxSum(TreeNode<Integer> root) {
		if(root == null) return;
		
		int currNodeSum = sum(root);
		for(int i=0; i<root.children.size(); i++) {
			maxSum(root.children.get(i));
		}
		if(currNodeSum > maxNodeSum) {
			maxNodeSum = currNodeSum;
			maxSumNode = root;
		}
	}
	
	public int sum(TreeNode<Integer> root) {
		int nodeSum = root.val;
		
		for(int i=0; i<root.children.size(); i++) {
			nodeSum += root.children.get(i).val;
		}
		return nodeSum;
	}
	
	public static void main(String[] args) {
		maxChildrenNodeSum m = new maxChildrenNodeSum();
		
		Scanner sc = new Scanner(System.in);
		TreeNode<Integer> root = TreeUse.takeInputLevelWise();
		
		m.maxSum(root);
		System.out.println(m.maxSumNode.val);
	}
}
