package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class insertionInDirectedGraph {
	public void usingMatrix() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of nodes: ");
		int n = sc.nextInt();
		System.out.println("Enter number of edges: ");
		int m = sc.nextInt();
		
		System.out.println("Enter the node pairs: ");
		int[][] adj = new int[n+1][n+1];
		int u, v;
		for(int i=0; i<m; i++) {
			u = sc.nextInt();
			v = sc.nextInt();
			adj[u][v] = 1;
		}
		
		sc.close();
	}
	
	public void usingList() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of nodes: ");
		int n = sc.nextInt();
		System.out.println("Enter number of edges: ");
		int m = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(n);
		
		for(int l=0; l<m; l++)
			adj.add(new ArrayList<Integer>());
			
		System.out.println("Enter nodes: ");
		for(int k=0; k<m; k++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			adj.get(u).add(v);
		}
		
		//For Printing
		for(int i=1; i<=n; i++) {
			System.out.print("\nAdjacency list of vertex" + i + "-->");
			for(int j = 0; j < adj.get(i).size(); j++) {
				System.out.print(adj.get(i).get(j) + ", ");
			}
			System.out.println();
		}
		
		sc.close();
	}
	
	public static void main(String[] args) {
		insertionInDirectedGraph in = new insertionInDirectedGraph();
		Scanner sc = new Scanner(System.in);
		
		//in.usingMatrix();
		in.usingList();
		sc.close();
	}
}
