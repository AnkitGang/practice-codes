package BitManipulation;

public class CheckOnlySingleElementInArray {
	public static void main(String[] args) {
		//XOR complete array
		
		int[] arr = {10, 10, 20, 30, 30};
		int singleElem = arr[0];
		
		for(int i=0; i<arr.length-1; i++) {
			singleElem = singleElem ^ arr[i+1];
		}
		
		System.out.println(singleElem);
	}
}
