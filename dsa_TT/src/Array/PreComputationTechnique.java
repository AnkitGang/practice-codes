package Array;

public class PreComputationTechnique {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		int prefix[] = new int[arr.length];
		prefix[0] = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			prefix[i] = prefix[i-1] + arr[i];
		}
		System.out.println("Original Array: ");
		for(int elem: arr)
			System.out.print(elem + " ");
		
		System.out.println();
		System.out.println("Prefix Array: ");
		for(int elem: prefix)
			System.out.print(elem + " ");
		
		System.out.println();
		int left = 2;
		int right = 5;
		System.out.println("Range of " + left + " and " + right + " sum is	");
		System.out.println(prefix[right] - prefix[left-1]);
		
	}
}
