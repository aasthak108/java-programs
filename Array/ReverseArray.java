class ReverseArray
{
	public static int[] reverseArray(int arr[],int start,int end)
	{
		if(start>=end)
		{
			return arr;
		}
	int temp;
	temp = arr[start];
	arr[start]= arr[end];
	arr[end] = temp;
	return reverseArray(arr,start+1,end-1);
	}
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5};
		int end =arr.length-1;
		int start = 0;
		int array[] = new ReverseArray().reverseArray(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Reversed Array is"+ array[i]);
		}
	}
}