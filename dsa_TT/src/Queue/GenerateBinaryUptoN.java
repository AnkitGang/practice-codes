package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryUptoN {
	
	//Approach 1 - dividing every number with 2 keep storing the remainder(0/1) in queue. al last pop the numbers one by one
	public void generateBinary() {
		
	}
	
	//Approach 2 - for(0 to n) Maintain String type queue and add 0 and 1 Simultaneously to every every element of queue
	public static void generateBinaryUsingBit(int n) {
		Queue<String> q = new LinkedList<>();
		q.add("1");
		for(int i=0; i<n; i++) {
			String curr = q.poll();
			System.out.println(curr);
			q.offer(curr + "0");
			q.offer(curr + "1");
		}
	}
	
	public static void main(String[] args) {
		generateBinaryUsingBit(10);
	}
}
