class RotateArray01
{
	static int[] rotateArray(int arr[],int k)
	{
		int a[]=new int[k];
		int b[]=new int[arr.length-k];
		int rotatedArray[] = new int[arr.length];
		for(int i=0;i<k;i++)
		{
			a[i]=arr[i];
		}
		for(int j=k;j<arr.length;j++) 
			
		{
			b[j-k] = arr[j];
		}
		int length,pos=0;
		for(int i=0;i<b.length;i++)
		{
			rotatedArray[i]=b[i];
			pos++;
		}
		for(int j=0;j<a.length;j++)
		{
			rotatedArray[pos++]=a[j];
		}
		return rotatedArray;
	}
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6};
		int k=3;
		int array[] = new RotateArray01().rotateArray(arr,k);
		for(int i=0;i<array.length;i++)
		{
			System.out.println("The rotated array is" + array[i]);
		}
	}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			