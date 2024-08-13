package DP;

import java.util.HashMap;

public class ClimbingStairs {   //LeetCode 70
	public int climbStairs(int n) {   //Memoization
        HashMap<Integer, Integer> cache = new HashMap<>();
        return climbStairsMemoization(n, cache);
    }

    private int climbStairsMemoization(int n, HashMap<Integer, Integer> cache){
        if(n == 0 || n == 1){
            return 1;
        }

        if(!cache.containsKey(n)){
            cache.put(n, climbStairsMemoization(n-1, cache) + climbStairsMemoization(n-2, cache));
        }
        return cache.get(n);
    }

    // public int climbStairs(int n) {   //Tabulation
    //     if(n == 0 || n == 1){
    //         return 1;
    //     }

    //     int[] cache = new int[n+1];
    //     cache[0] = cache[1] = 1;

    //     for(int i=2; i<=n; i++){
    //         cache[i] = cache[i-1] + cache[i-2];
    //     }

    //     return cache[n];
    // }

//RECURSION
    // public int climbStairs(int n) {
    //     if(n == 1 || n == 2)
    //         return n;
        
    //     return climbStairs(n-1) + climbStairs(n-2);
    // }
}
