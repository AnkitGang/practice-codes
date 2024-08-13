import java.util.*;

public class matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[2][3];
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                m[i][j] = sc.nextInt();
            }
        }
        int[][] n = transpose(m);
        printMatrix(n);
    }

    private static void printMatrix(int[][] transposeMatrix){
        for(int[] row : transposeMatrix) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static int[][] transpose(int[][] m){
        // business logic
        int[][] n = new int[m[0].length][m.length];
        for(int i=0; i<m[0].length; i++){
            for(int j=0; j<m.length; j++){
                n[i][j] = m[j][i];
            }
        }
        return n;
    }
}