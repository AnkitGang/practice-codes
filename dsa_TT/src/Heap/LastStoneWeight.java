package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {  //leetcode 1046
	public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: stones){
            maxHeap.add(i);
        }

        while(maxHeap.size() > 1){
            int x1 = maxHeap.poll();
            int x2 = maxHeap.poll();
            int difference = x1 - x2;
            maxHeap.add(difference);
        }
        return maxHeap.poll();
    }
}
