package Graph;

import java.util.ArrayList;

public class DetectCycle {
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        // for undirected graph connect u and v and then v and u
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static boolean dfsRecursion(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int parent) {
        visited[s] = true;
        
        for(int u : adj.get(s)) {
            if(visited[u] == false) {
                if(dfsRecursion(adj, u, visited, s) == true) {
                	return true;
                }
                else if(u != parent) {
                	return true;
                }
            }
        }
        return false;
    }

    static boolean dfs(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];
        for(int i = 0; i < v; i++) {
            visited[i] = false;
        }
        // dfsRec(adj, s, visited);
        // for disconnected
        for(int i = 0; i < v; i++) {
            if(visited[i] == false) {
                if(dfsRecursion(adj, i, visited, -1) == true) {
                	return false;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);				//	0------1-----2-----3
        addEdge(adj, 1, 2);				//					   |
        addEdge(adj, 2, 3);				//					   |
        addEdge(adj, 3, 4);				//		   6----5------4
        addEdge(adj, 4, 5);				//	
        addEdge(adj, 5, 6);				//	
        boolean res = dfs(adj, V);
        System.out.println(res);
    }
}
