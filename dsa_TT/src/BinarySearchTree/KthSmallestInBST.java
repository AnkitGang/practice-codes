package BinarySearchTree;

public class KthSmallestInBST {
	int count = 0;
    int ans = -1;
    public int kthSmallest(BSTNode<Integer> root, int k) {
        inOrder(root, k);
        return ans;
    }

    public void inOrder(BSTNode<Integer> root, int k){
        if(root == null){
            return ;
        }
        inOrder(root.left, k);
        count++;
        if(count == k){
            ans = root.data;
        }
        inOrder(root.right, k);
    }
}
