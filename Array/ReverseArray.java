class ReverseArray2
{
	int[] reverse(int arr[],int s,int e)
	{
		if(s<e)
		{
			int temp;
			temp=arr[e];
			arr[e]=arr[s];
			arr[s]=temp;
			return reverse(arr,s+1,e-1);
		}
	return arr;
	}
	public static void main(String args[])
	
	{
		int arr[] = {1,2,3,4,5};
		int s=0;
		int e=arr.length-1;
		int[] array=new ReverseArray2().reverse(arr,s,e);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(""+array[i]);
		}
	}
}