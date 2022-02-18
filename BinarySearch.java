class BinarySearch
{
	public int doBinarySearch(int arr[], int key)
	{
		int l = 0;
		int r = arr.length - 1;
		(l<=r)
		{
			int mid= (l+r)/2;
			if(key == arr[mid])
			{
				return mid;
			}
			else if(key > arr[mid])
			{
				 l = mid + 1;
			}
			else
			{
				 r = mid - 1;
			}
		}
		return -1;
	}
		
	public static void main(String args[])
		{
			int arr[]={1,3,7,8,15,56,90};
			int valueToBeSearched = 0;
			int indexOfNumberFound = new BinarySearch().doBinarySearch(arr, valueToBeSearched);
			if(indexOfNumberFound != -1)
			{
				System.out.println(" The searched key is at index " + indexOfNumberFound);
			}
			else
			{
				System.out.println(" The searched key is not found");
			}
		}
}
		
		
		