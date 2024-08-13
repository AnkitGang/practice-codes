package Tree;

import java.util.LinkedList;
import java.util.Queue;


public class LevelOfANode {   //GFG 
	public int getLevel(BinaryTreeNode<Integer> node, int data) {
        Queue<BinaryTreeNode<Integer>> q=new LinkedList<>();
        int level=1;
        q.add(node);
        
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0; i<size; i++)
            {
                BinaryTreeNode<Integer> t=q.poll();
                if(t.data == data)
                	return level;
                
                if(t.left!=null)
                	q.add(t.left);
                if(t.right!=null)
                	q.add(t.right);
            }
            level++;
        }
        
        return 0;
    }
}
