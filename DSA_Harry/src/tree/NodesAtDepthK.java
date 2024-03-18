package tree;

public class NodesAtDepthK {
	public void printAtK(TreeNode<Integer> root, int k) {
		if(k < 0)
			return;
		
		if(k == 0) {
			System.out.print(root.val + ", ");
			return;
		}
		
		for(int i=0; i<root.children.size(); i++)
			printAtK(root.children.get(i), k - 1);
			
	}
	
	public static void main(String[] args) {
		NodesAtDepthK d = new NodesAtDepthK();
		TreeNode<Integer> root = TreeUse.takeInputLevelWise();
		
		System.out.println("Nodes at Depth 2: ");
		d.printAtK(root, 2);
	}

}
