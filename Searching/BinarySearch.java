
class BinarySearch
{
	public int doBinarySearch(int arr[], int key,int l,int r)
	{
		while(l<=r)
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
			int arr[]={0,0,0,1,1,1,1};
			int key= 1;
			int l = 0;
			int r = arr.length;
			int indexOfNumberFound = new BinarySearch().doBinarySearch(arr, key,l,r);
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
		
		
		