class MinJumps
{
	static int minJumps(int arr[])
	{
		int i,j;
		int jumps[]=new int[arr.length];
		jumps[0]=0;
		for(i=1;i<arr.length;i++)
		{
			jumps[i]=Integer.MAX_VALUE;
			for(j=0;j<i;j++)
			{
				if(i<=j+arr[j] && jumps[j]!=Integer.MAX_VALUE)
				{
					if(jumps[i]<jumps[j]+1)
					{
						jumps[i] = jumps[i];
					}
					else
					{
						jumps[i]=jumps[j]+1;
					}
				}
			}
		}
		return jumps[arr.length-1];
	}
	public static void main(String args[])
	{
		int arr[] = {1,1,6,7,3};
		System.out.println(""+minJumps(arr));
	}
}
			