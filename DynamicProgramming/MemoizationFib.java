class MemoizationFib
{
	static int findnthFib(int dp[],int n)
	{
		if(dp[n]==-1)
		{
			if(n<2)
			{
				return n;
			}
			else
			{
				int a = findnthFib(dp,n-1);
				int b = findnthFib(dp,n-2);
				dp[n]=a+b;
			}
		}
		return dp[n];
	}
	public static void main(String args[])
	{
		int i,n=5;
		int dp[] = new int[7];
		for(i=1;i<=n;i++)
		{
			dp[i]=-1;
		}
		System.out.println(""+findnthFib(dp,n));
	}
}