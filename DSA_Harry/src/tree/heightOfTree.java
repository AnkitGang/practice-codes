package tree;

import java.util.Scanner;

public class heightOfTree {
	public int treeHeight(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int height = 1;
		
		if(root.children != null) {
			if(root.children.size() == 0)
				return height;
			else {
				for(int i=0; i<root.children.size(); i++)
					height = Math.max(height, treeHeight(root.children.get(i)));
				return height+1;
			}
		}
		else
			return height;
	}

	public static void main(String[] args) {
		heightOfTree h = new heightOfTree();
		Scanner sc = new Scanner(System.in);
		
		TreeNode<Integer> root = TreeUse.takeInputLevelWise();
		System.out.println("Height of Tree: " + h.treeHeight(root));
		
		sc.close();
	}

}
