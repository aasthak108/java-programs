class InsertionSort
{
	public int[] insertionSorting(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int j = i-1;
			int k = i;
			while(j>=0)
				
			{
				// Swap, if left side is greater
				if(arr[j] >= arr[k])
				{
					int temp = arr[k]; // 5
					arr[k] = arr[j]; // 13 
					arr[j] = temp; // 5 
					k--;
					
				}
				j--;	
			}
		}
		return arr;
	}
	
	public static void main(String args[])
	{
		int arr[]={12,11,13,5,6};
		int sortedArray[]=new InsertionSort().insertionSorting(arr);
		System.out.println("Sorted Array Using Insertion Sort Algorithm:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(sortedArray[i]);
		}
	}
}