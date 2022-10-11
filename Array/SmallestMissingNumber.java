class SmallestMissingNumber
{
	static int smallestMissingNumber(int arr[])
	{
		int length= arr.length;
		int i=0,j=1;
		while(i<length)
		{
			if(arr[i]+1==arr[j])
			{
				i++;
				j++;
			}
			else
			{
				return arr[i]+1;
			}
		}
		return arr[i]+1;
	}
	public static void main(String args[])
	{
		int arr[] = {0,4,1,3,7};
		System.out.println(" " + smallestMissingNumber(arr));
	}
}