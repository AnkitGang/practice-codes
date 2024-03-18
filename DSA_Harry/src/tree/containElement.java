package tree;

import java.util.Scanner;

public class containElement {

	public boolean contain(TreeNode<Integer> root, int elem) {
		if (root == null)
			return false;

		if (root.val == elem)
			return true;

		for(int i=0; i<root.children.size(); i++) {
			boolean c;
			c = contain(root.children.get(i), elem);
			
			if(c)
				return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		containElement c = new containElement();
		Scanner sc = new Scanner(System.in);
		TreeNode<Integer> root = TreeUse.takeInputLevelWise();

		System.out.println("Enter element you want to search: ");
		int elem = sc.nextInt();

		boolean isPresent = c.contain(root, elem);
		System.out.println(isPresent);

		sc.close();
	}
}
