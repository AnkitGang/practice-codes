package Tree;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class VerticalSum {
	
	static int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    
    public ArrayList <Integer> verticalSum(BinaryTreeNode<Integer> root) {
       
        ArrayList<Integer> ans = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        verticalTraversal(root, 0, map);
        
        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            ans.add(m.getValue());
        }
        return ans;
    }
    
    public void verticalTraversal(BinaryTreeNode<Integer> root, int distance, TreeMap<Integer, Integer> map){
        if(root == null) return;
        if(!map.containsKey(distance)){
            map.put(distance, root.data);
        }
        else{
            map.put(distance, map.get(distance) + root.data);
        }
        
        if(distance > max){
            max = distance;
        }
        if(distance < min){
            min = distance;
        }
        
        verticalTraversal(root.left, distance-1, map);
        verticalTraversal(root.right, distance+1, map);
    }
}
