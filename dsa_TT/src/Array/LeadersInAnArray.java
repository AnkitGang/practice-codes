package Array;

import java.util.ArrayList;
import java.util.Collections;

//GFG Problem
public class LeadersInAnArray {
	public static ArrayList<Integer> leaderElements(int[] arr, int n){
		int max = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] >= max){
                max = arr[i];
                list.add(max);
            }
        }
        
        Collections.reverse(list);
        return list;
	}
	
	public static void main(String[] args) {
		
	}
}

