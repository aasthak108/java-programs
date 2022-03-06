class QuickSort{
public int[] quickSorting(int arr[],int h,int l)
{
	int i=l-1;
	for(int j=0;j<arr.length;j++)
	{
		if(arr[j]<=arr[h])
		{
			i++;
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
	}
		int temp=arr[h];
		arr[h]=arr[i+1];
		arr[i+1]= temp;
		return arr;
}
public static void main(String args[])
{
	int arr[]={10,80,30,90,40,50,70};
	int h= arr.length-1;
	int l= 0;
	int SortedArr[]=new QuickSort().quickSorting(arr,h,l);
	for(int j=0;j<arr.length;j++)
	{
		System.out.println(SortedArr[j] + " is the required array");
	}
}
}