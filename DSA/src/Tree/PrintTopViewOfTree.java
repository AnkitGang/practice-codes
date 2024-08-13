package Tree;

import java.util.*;

class Pair {
    BinaryTreeNode<Integer> node;
    int hd;
    Pair(BinaryTreeNode<Integer> node, int hd){
        this.node = node;
        this.hd = hd;
    }
}

public class PrintTopViewOfTree {
	static void topView(BinaryTreeNode<Integer> root)
    {
        if(root == null){
            return ;
        }
        
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        
        while(!q.isEmpty()){
            Pair front = q.poll();
            BinaryTreeNode<Integer> frontNode = front.node;
            int hd = front.hd;
            
            if(!map.containsKey(hd)){
                map.put(hd, frontNode.data);
            }
            if(frontNode.left != null){
                q.offer(new Pair(frontNode.left, hd-1));
            }
            if(frontNode.right != null){
                q.offer(new Pair(frontNode.right, hd+1));
            }
        }
        
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            System.out.print((e.getValue() + " "));
        }
    }
	
	public static void main(String[] args) {
		BinaryTreeTraversalIterative bt = new BinaryTreeTraversalIterative();
		BinaryTreeNode<Integer> root = bt.insert();
		topView(root);
	}
}



















