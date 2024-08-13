package Tree;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class VerticalOrderOfTree {
	
	public void verticalOrder(BinaryTreeNode<Integer> root, int distance, TreeMap<Integer, ArrayList<Integer>> map) {
		if(root == null) {
			return;
		}
		if(map.get(distance) == null) {  //no distance exist
			//Create a fresh arraylist
			ArrayList<Integer> list = new ArrayList<>();
			list.add(root.data);
			map.put(distance, list);
		}
		else {  //distance exist, get the old list, add new element
			ArrayList<Integer> l = map.get(distance);
			l.add(root.data);
			map.put(distance, l);
		}
		verticalOrder(root.left, distance - 1, map);
		verticalOrder(root.right, distance + 1, map);
	}
	
	public void printVerticalOrder(BinaryTreeNode<Integer> root) {
		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
		verticalOrder(root, 0, map);
		for(Map.Entry<Integer, ArrayList<Integer>> m: map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
