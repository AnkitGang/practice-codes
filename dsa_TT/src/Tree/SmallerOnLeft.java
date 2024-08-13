package Tree;

import java.util.TreeSet;

public class SmallerOnLeft {   //GFG
	public static int[] Smallestonleft (int arr[], int n) {
        // Complete the function
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(-1);
        for(int i=0; i<n; i++){
            ts.add(arr[i]);      //push arr[i] to tree
            arr[i] = ts.lower(arr[i]);  //finding just lower element than arr[i]
        }
        return arr;
    }
}
