class MergeSortedArray
{
	public int[] mergeSortedArray(int arr1[],int arr2[],int n,int m)
	{
		int i=0,j=0,k=0;
		int arr3[] = new int[n+m];
		while(i<n && j<m)
		{
			if(arr2[j] > arr1[i])
			{
				arr3[k++] = arr1[i++];
			}
			else
			{
				arr3[k++]= arr2[j++];
			}
		}
		while(i<n)
		{
			arr3[k++] = arr1[i++];
		}
		while(j<m)
		{
			arr3[k++] = arr2[j++];
		}
		return arr3;
	}
	public static void main(String args[])
	{
		int arr1[]={1,2,3,4};
		int arr2[]={5,6,7,8};
		int n = arr1.length;
		int m = arr2.length;
		int mergedArray[] = new MergeSortedArray().mergeSortedArray(arr1,arr2,n,m);
		for(int i=0;i<m+n;i++)
		{
			System.out.println("The sorted merged array is"+mergedArray[i]);
		}
	}
}
		