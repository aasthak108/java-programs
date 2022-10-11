class StockBuySell2
{
	static void getMaxProfit(int arr[])
	{
		int buyPrice[]=new int[arr.length];
		int sellPrice[]=new int[arr.length];
		int buy,sell;
		for(int i=0;i<arr.length;i++)
		{
			if(i==0 && arr[i]<arr[i+1])
			{
				buyPrice[i]=arr[i];
				buy = i;
				System.out.println("the buy day is " + i + "the price is " +buyPrice[i]);
			}
			else
			{
				sellPrice[i]=arr[i];
				sell = i;
				System.out.println("the sell day is " + i + "the price is " +sellPrice[i]);
			}
			if(i==arr.length-1 && arr[i]>arr[i-1])
			{
				sellPrice[i]=arr[i];
				sell = i;
				System.out.println("the sell day is " + i + "the price is " + sellPrice[i]);
			}
			else if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
			{
				sellPrice[i]=arr[i];
				sell= i;
				System.out.println("the sell day is " + i + "the price is " +sellPrice[i]);
			}
			else
			{
				buyPrice[i]=arr[i];
				buy = i;
				System.out.println("the buy day is " + i + "the price is " +buyPrice[i]);
			}
		}
	}
	public static void main(String args[])
	{
		int arr[] = {100,180,260,310,40,535,695};
		StockBuySell2 s = new StockBuySell2();
		s.getMaxProfit(arr);
	}
}
