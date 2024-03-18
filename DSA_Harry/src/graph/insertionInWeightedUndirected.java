package graph;

import java.util.ArrayList;
import java.util.Scanner;

import Linked_List.Node;

public class insertionInWeightedUndirected {
	public void usingMatrix() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of nodes: ");
		int n = sc.nextInt();
		System.out.println("Enter number of edges: ");
		int m = sc.nextInt();
		
		System.out.println("Enter the edge nodes and corresponding weight: ");
		int[][] adj = new int[n+1][n+1];
		int u, v, w;
		for(int i=0; i<m; i++) {
			u = sc.nextInt();
			v = sc.nextInt();
			w = sc.nextInt();
			adj[u][v] = w;
			adj[v][u] = w;
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
			
		System.out.println("Enter the edge nodes and corresponding weight: ");
		for(int k=0; k<m; k++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();
			Node<Integer> node = new Node<Integer>(w);
			adj.get(u).add(v).;
			adj.get(v).add(u);
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
		insertionInWeightedUndirected in = new insertionInWeightedUndirected();
		Scanner sc = new Scanner(System.in);
		
		//in.usingMatrix();
		in.usingList();
		sc.close();
	}
}
