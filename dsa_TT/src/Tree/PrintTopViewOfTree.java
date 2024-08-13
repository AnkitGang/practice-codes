package Tree;

import java.util.*;

public class PrintTopViewOfTree {
	public static void topView(BinaryTreeNode<Integer> root, int distance, TreeMap<Integer,ArrayList<Integer>> map ){
        // Termination Case
        if(root == null){
            return ;
        }
        if(map.get(distance)==null){ // No Distance Exist
            // Create Fresh ArrayList
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.data);
            map.put(distance,list);
        }
     
        topView(root.left, distance -1 , map);
        topView(root.right, distance +1 , map);
    }
	
	public static void printTopView(BinaryTreeNode<Integer> root) {
		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
		topView(root, 0, map);
		for(Map.Entry<Integer, ArrayList<Integer>> m: map.entrySet()) {
			System.out.println(m.getValue());
		}
	}
	
	public static void main(String[] args) {
		BinaryTreeTraversalRecursion bt = new BinaryTreeTraversalRecursion();
		BinaryTreeNode<Integer> root = bt.insert();
		printTopView(root);
	}
}



















