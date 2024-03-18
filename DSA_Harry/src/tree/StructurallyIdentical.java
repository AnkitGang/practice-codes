package tree;

public class StructurallyIdentical {
	public boolean isIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2) {
		if(root1 == null && root2 == null)
			return true;
		
		if(root1 == null || root2 == null || root1.val != root2.val)
			return false;
		
		for(int i=0; i<root1.children.size() && i<root2.children.size(); i++) {
			boolean ans = isIdentical(root1.children.get(i), root2.children.get(i));
			if(!ans)
				return ans;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		StructurallyIdentical s = new StructurallyIdentical();
		
		System.out.println("Enter tree 1: ");
		TreeNode<Integer> root1 = TreeUse.takeInputLevelWise();
		System.out.println("Enter tree 2: ");
		TreeNode<Integer> root2 = TreeUse.takeInputLevelWise();
		
		System.out.println(s.isIdentical(root1, root2));
	}
}
