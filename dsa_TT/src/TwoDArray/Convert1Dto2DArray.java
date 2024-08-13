package TwoDArray;

public class Convert1Dto2DArray {
	public static void main(String[] args) {
		int [] ar = {1,2,3,4,5,6};
		int n = 2;
		int m = 3;
		int k = 0;
		int [][] twoD = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(k == ar.length)
					break;
				twoD[i][j] = ar[k++];
			}
		}
		for(int i=0; i<twoD.length; i++) {
			for(int j=0; j<twoD[i].length; j++) {
				System.out.print(twoD[i][j] + " ");
			}
			System.out.println();
		}
		
		
//		if(m*n != ar.length) {
//			twoD = new int[0][0];
//		}
//		
//		int r = 0;
//		int c = 0;
//		for(int i=0; i<ar.length; i++) {
//			twoD[r][c] = ar[i];
//			c++;
//			if(c == m) {
//				r++;
//				c = 0;
//			}
//		}
//		
//		for(int i=0; i<twoD.length; i++) {
//			for(int j=0; j<twoD[i].length; j++) {
//				System.out.print(twoD[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
