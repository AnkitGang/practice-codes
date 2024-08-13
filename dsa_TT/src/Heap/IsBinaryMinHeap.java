package Heap;

import Tree.BinaryTreeNode;

public class IsBinaryMinHeap {

    public static boolean isMinHeap(BinaryTreeNode<Integer> root){
        return helper(root, Integer.MIN_VALUE);
    }

    static boolean helper(BinaryTreeNode<Integer> node, int parentValue){
        if(node == null){
            return true;
        }
        if(node.data < parentValue){
            return false;
        }
        return helper(node.left, node.data) && helper(node.right, node.data);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root  =new BinaryTreeNode<Integer>(10);
        root.left = new BinaryTreeNode(20);
        root.right = new BinaryTreeNode(30);
        root.left.left = new BinaryTreeNode(40);
        root.left.right = new BinaryTreeNode(50);
        System.out.println(isMinHeap(root));
    }
}
