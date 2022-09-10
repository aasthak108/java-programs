class StockBuySell
{
	static int profit(int arr[],int n)
	{
		int j;
		int sum=0;
		for(j=1;j<n;j++)
		{
			if(arr[j]>arr[j-1])
			{
				sum = sum+arr[j]-arr[j-1];
			}
		}
		return sum;
	}
	public static void main(String args[])
	{
		int arr[]={1,2,100};
		int n = arr.length;
		System.out.println(""+profit(arr,n));
	}
}