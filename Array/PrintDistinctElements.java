class PrintDistinctElements
{
	public static void main(String args[])
	{
		int arr[]={12,10,9,45,2,10,10,45};
		int count =0;
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			if(arr[i] == arr[j])
			{
				count++;
			}
			}
		}
		count = c;
		int arr1[] = new PrintDistinctElements().printDistinctElements(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("The required array is "+ arr1[i]);
		}
	}
	
	public static int[] printDistinctElements(int arr[])
	{
		int a[] = new int[arr.length - count];
		for(int i=0;i<arr.length;i++)
		{
			for(int j =1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(""+ arr[j]);
				}
				else
				{
					System.out.println(""+arr[i]);
				}
			}
		}
		return arr;
	}
}
			