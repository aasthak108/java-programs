class FindSecondMax
{
	static int findSecondMax(int arr[])
	{
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				secondMax=max;
				max=arr[i];
			}
			else if(secondMax<arr[i] && max >arr[i])
			{
				secondMax=arr[i];
			}
		}
		return secondMax;
	}
	public static void main(String args[])
	{
		int arr[] = {1,2,3,5,3,7,99,67};
		System.out.println(""+findSecondMax(arr));
	}
}