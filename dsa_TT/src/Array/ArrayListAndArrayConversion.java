package Array;

import java.util.Arrays;
import java.util.List;

public class ArrayListAndArrayConversion {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		List<int[]> list = Arrays.asList(arr);
		int[] arr1 = list.toArray(new int[list.size()]); //returns object
	}
}
