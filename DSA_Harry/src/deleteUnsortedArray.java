
public class deleteUnsortedArray {
	static int findElement(int arr[], int n, int key) {
		for(int i=0; i<n; i++) {
			if(arr[i] == key)
				return i;
		}
		
		return -1;
	}
	
	static int deleteElement(int arr[], int n, int key) {
		int position = findElement(arr, n, key);
		
		if(position == -1) {
			System.out.println("Element not found");
			return n;
		}
		
		for(int i=position; i<n-1; i++)
			arr[i] = arr[i+1];
		
		return n-1;
	}
	
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 45, 6, 67};
		
		int n = arr.length;
		int key = 45;
		
		System.out.println("Array before deleting");
		for(int i=0; i<n; i++)
			System.out.println(arr[i] + " ");
		
		n = deleteElement(arr, n, key);
		
		System.out.println("\nArray after deleting");
		for(int i=0; i<n; i++)
			System.out.println(arr[i] + " ");

	}

}
