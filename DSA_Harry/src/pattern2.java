
public class pattern2 {
	public static void main(String[] args) {
		int s = 0;
		for(int i=9; i>=0; i=i-2) {
			for(int k=0; k<s; k++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			
			System.out.println();
			s++;
		}
		s--;
		for(int i=3; i<10; i=i+2) {
			--s;
			for(int k=0; k<s; k++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
}
