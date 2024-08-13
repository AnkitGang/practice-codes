package TwoDArray;

public class example {
	public static void main(String[] args) {
		int x[][]  = new int[3][3];
		int [][]y = new int[3][3];
		int []z[] = new int[3][3];
		int a[][] = {{1,2,3, 4}, {10,20,7, 30}, {1,7, 1,2}};
		int b[][] = new int[3][];
		
		b[0] = new int[5];
		b[1] = new int[6];
		b[2] = new int[7];
		
		//Row Major Access
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Column Major Access
		int[][] c = new int[3][3];
		for(int i=0; i<a[0].length; i++) {
			for(int j=0; j<a.length; j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
		
//		System.out.println();
//		//Enhance for loop (Java 1.5 onwards)
//		for(int[] a1 : b) {
//			for(int e: a1) {
//				System.out.print(e + " ");
//			}
//			System.out.println();
//		}
		
		
		
 	}
}
