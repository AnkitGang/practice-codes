import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

class LRU
{
	
	static int pageFaults(int pages[], int n, int capacity)
	{
		HashSet<Integer> s = new HashSet<>(capacity);
		HashMap<Integer, Integer> indexes = new HashMap<>();
		int page_faults = 0;
		System.out.println("Frame allocation list: ");
		for (int i=0; i<n; i++)
		{
			if (s.size() < capacity)
			{
				if (!s.contains(pages[i]))
				{
					s.add(pages[i]);
					page_faults++;
				}
	
				indexes.put(pages[i], i);
			}
			else
			{
				if (!s.contains(pages[i]))
				{
					int lru = Integer.MAX_VALUE, val=Integer.MIN_VALUE;
					
					Iterator<Integer> itr = s.iterator();
					
					while (itr.hasNext()) {
						int temp = itr.next();
						if (indexes.get(temp) < lru)
						{
							lru = indexes.get(temp);
							val = temp;
						}
					}
					s.remove(val);
				indexes.remove(val);
					s.add(pages[i]);
					page_faults++;
				}
				indexes.put(pages[i], i);
			}
			
			System.out.println(s);
		}
	
		return page_faults;
	}
	
	public static void main(String args[])
	{
		int minVal = 1;
		int maxVal = 10;
		System.out.println("10 random numbers: ");

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
		    arr[i] = ThreadLocalRandom.current().nextInt(minVal, maxVal);
		}

		System.out.println(Arrays.toString(arr));
		
		
		int capacity = 3;
		
	
		System.out.println("Page faults: "+pageFaults(arr, arr.length, capacity));
	}
}