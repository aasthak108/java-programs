class MostOccuredElement
{
	static int majorityElement(int arr[])
	{
		int max=0;
		int count=0;
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(max<count)
			{
				max=count;
				index=i;
			}
		}
		return arr[index];
	}
	public static void main(String args[])
	{
		int arr[]={1,1,3,2,2,2,2,2,3};
		System.out.println(majorityElement(arr) + " is the majority element");
	}
}