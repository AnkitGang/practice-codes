package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class MergeKSortedLists {
	public Node<Integer>mergeKLists(Node<Integer>[] lists) {
        if(lists.length == 0){
            return null;
        }
        ArrayList<Integer> mergedList = new ArrayList<>();
        for(Node<Integer>arr: lists){
            while(arr != null){
                mergedList.add(arr.data);
                arr = arr.next;
            }
        }

        Collections.sort(mergedList);

        Node<Integer>ans = null;
        Node<Integer>temp = null;
        for(Integer i: mergedList){
            if(temp == null){
                temp = new Node<Integer>(i);
                ans = temp;
            }
            else{
                temp.next = new Node<Integer>(i);
                temp = temp.next;
            }
        }
        return ans;
    }
}
