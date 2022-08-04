class QuickSort{
public static int partition(int arr[],int low,int high)
{
	int i = low -1;
	int pivot = arr[high];
	for(int j = low;j<high;j++)
	{
		if(arr[j]<=pivot)
		{
			i++;
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j] = temp;
		}
	}
	int temp = arr[i+1];
	arr[i+1]=arr[high];
	arr[high] = temp;
	return i+1;
}
void quickSort(int arr[],int low,int high)
{
	if(low<high)
	{
		int p = partition(arr,low,high);
		quickSort(arr,low,p-1);
		quickSort(arr,p+1,high);
	}
}
void print(int arr[])
{
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(""+arr[i]);
	}
}
public static void main(String args[])
{
	int arr[] = {5,3,7,2,6,1};
	int low = 0;
	int high = arr.length-1;
	QuickSort s = new QuickSort();
	s.quickSort(arr,low,high);
	s.print(arr);
}
}