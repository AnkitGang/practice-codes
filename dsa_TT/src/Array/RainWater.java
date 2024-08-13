package Array;

public class RainWater {  //LeetCode 42.
	
	public static void main(String[] args) {
		int [] pillars = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		if(pillars.length == 0)
			System.out.println("No pillars exist, so cant store water");
		
		System.out.println("Pillars: ");
		for(int elem: pillars)
			System.out.print(elem + " ");
		
		//Left Max Pillar (Prefix Max)
		int[] leftPillarMax = new int[pillars.length];
		leftPillarMax[0] = pillars[0];
		for(int i=1; i<pillars.length; i++) {
			leftPillarMax[i] = Math.max(leftPillarMax[i-1], pillars[i]);
		}
		
		
		System.out.println("\nLeft Pillar Max");
		for(int elem: leftPillarMax)
			System.out.print(elem + " ");
		
		
		//Right Max Pillar (Suffix Max)
		int[] rightMaxPillar = new int[pillars.length];
		rightMaxPillar[rightMaxPillar.length-1] = pillars[pillars.length-1];
		
		for(int i = rightMaxPillar.length-2; i>=0; i--) {
			rightMaxPillar[i] = Math.max(rightMaxPillar[i+1], pillars[i]);
		}
		
		System.out.println();
		System.out.println("Right Pillar Max");
		for(int elem: rightMaxPillar)
			System.out.print(elem + " ");
		
		int amountOfWater = 0;
		for(int i=0; i<pillars.length; i++) {
			int currPillar = pillars[i];
			int decideHeight = Math.min(leftPillarMax[i], rightMaxPillar[i]);
			if(decideHeight > currPillar)
				amountOfWater += decideHeight - currPillar;
			
		}
		
		System.out.println();
		System.out.println(amountOfWater);
	}
}
