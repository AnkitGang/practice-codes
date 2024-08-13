package Array;

public class Sort0And1 {
	public static void main(String[] args) {
		int[] arr = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1};
		int count0 = 0;
		
		for(int elem: arr)
			if(elem == 0)
				count0++;
		
		int i=0;
		while(count0 != 0) {
			arr[i] = 0;
			count0--;
			i++;
		}
		while(i<arr.length){
			arr[i] = 1;
			i++;
		}
		
		for(int elem: arr)
			System.out.print(elem + " ");
	}
}
