package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class PrintBottomView {
	class BinaryNode<T>{
		T data;
		int horizontalDistance;
		BinaryNode<T> left, right;
		
		public BinaryNode(T data) {
			this.data = data;
			horizontalDistance = Integer.MAX_VALUE;
			left = right = null;
		}
	}
	
	public ArrayList<Integer> bottomView(BinaryNode<Integer> root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<BinaryNode<Integer>> q = new LinkedList<BinaryNode<Integer>>();
        root.horizontalDistance = 0;
        
        q.add(root);
        while(!q.isEmpty()){
            BinaryNode<Integer>curr = q.poll();
            
            map.put(curr.horizontalDistance, curr.data);
            if(curr.left != null){
                q.add(curr.left);
                curr.left.horizontalDistance = curr.horizontalDistance - 1;
            }
            if(curr.right != null){
                q.add(curr.right);
                curr.right.horizontalDistance = curr.horizontalDistance + 1;
            }
        }
        
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            ans.add(e.getValue());
        }
        
        return ans;
    }
}
