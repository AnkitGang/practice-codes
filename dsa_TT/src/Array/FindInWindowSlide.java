package Array;

public class FindInWindowSlide {
	public static void main(String[] args) {
		int[] arr = {1,2,3,2,1,2,3,1};
		int k = 3;  //window
		int x = 2;  //element to search
		int f = 0;  //frequency
		for(int i=0; i<k; i++) {
			if(arr[i] == x)
				f++;
		}
		
		System.out.println("First " + f);
		
		for(int j=k; j < arr.length; j++) {
			int outElement = arr[j-k];
			if(outElement == x)
				f--;
			int inElement = arr[j];
			if(inElement == x)
				f++;
			
			System.out.println("First " + f);
		}
	}
}
