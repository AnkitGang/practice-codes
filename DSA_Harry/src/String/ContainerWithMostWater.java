package String;

import java.util.*;

public class ContainerWithMostWater {
	public static int maxArea(int[] a) {
		int area = 0, newArea = 0;
		int i = 0;
		int j = a.length - 1;
		while(i<j) {
			newArea = (j-i)*Math.min(a[i], a[j]);
			if(newArea > area)
				area = newArea;
			
			if(a[i] < a[j])
				i++;
			else
				j--;
		}
		
		return area;
	}
	public static void main(String[] args) {
		int[] a = {1, 5, 4, 3};
		int[] b = {3, 1, 2, 4, 5};
		System.out.println("Area: " + maxArea(b));
	}

}
