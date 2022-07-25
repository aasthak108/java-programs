
class SelectionSort
{
	public int[] selectionSort(int arr[])
	{
		int i,j,min;
		int n =arr.length;
		for(i=0;i<n-1;i++)
		{
			min = i;
			for(j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min = j;
				}
			}
			if(min!=i)
			{
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			}
		}
		return arr;
	}
	public static void main(String args[])
	{
		int arr[] = {1,5,3,8,7,2};
		int array[] =new SelectionSort().selectionSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(""+array[i]);
		}
	}
}
			