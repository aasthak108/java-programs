class RotateArray
{
	static int[] rotateArray(int arr[],int k)
	{
		int a[]=new int[k];
		int rotatedArray[] = new int[arr.length];
		for(int i=0;i<k;i++)
		{
			a[i]=arr[i];
		}
		int pos=0;
		for(int j=k;j<arr.length;j++) 
			
		{
			rotatedArray[j-k] = arr[j];
			pos++;
		}
		int length;
		for(int i=pos;i<a.length;i++)
		{
			rotatedArray[pos++]=a[i];
		}
		return rotatedArray;
	}
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6};
		int k=3;
		int array[] = new RotateArray().rotateArray(arr,k);
		for(int i=0;i<array.length;i++)
		{
			System.out.println("The rotated array is" + array[i]);
		}
	}
}
			
			
			
			
			
			