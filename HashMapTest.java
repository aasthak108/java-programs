
import java.util.*;
class HashMapTest
{
	   public static int[] createHashMap(int arr[])
	{
		HashMap<Integer,Integer> 
		hmap = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			int c = hmap.get(arr[i]);
			if(hmap.get(arr[i]) == null)
			{
				hmap.put(arr[i],1);
			}
			else
			{
				hmap.put(arr[i],c++);
			}
		}
		return arr;
	}
	public static void main(String args[])
	{
		int arr[]={1,1,2,2,2,3,4,4};
		int i =0;
		System.out.println(createHashMap(arr));
	}
}
				
			
		