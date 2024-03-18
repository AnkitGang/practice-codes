package tree;

import java.util.Scanner;

public class nodesGreaterThanX {
	
	public int count(TreeNode<Integer> root, int x) {
		if(root == null)
			return 0;
		
		int c = 0;
		if(root.val > x)
			c++;
		
		for(int i=0; i<root.children.size(); i++)
			c += count(root.children.get(i), x);
		
		return c;
	}

	public static void main(String[] args) {
		nodesGreaterThanX n = new nodesGreaterThanX();
		Scanner sc = new Scanner(System.in);
		TreeNode<Integer> root = TreeUse.takeInputLevelWise();
		
		System.out.println("Enter value of X: ");
		int x = sc.nextInt();
		System.out.println(n.count(root, x));
		
		sc.close();
	}
}
