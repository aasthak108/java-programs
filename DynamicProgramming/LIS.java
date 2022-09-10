public class LIS
{
	public static void main(String args[])
	{
		int arr[] = {1,6,2,8,5,9,7,10};
		System.out.println(""+maxLisLength(arr));
	}
	static int maxLisLength(int arr[])
	{
		int i,j;
		int count=0;
		int lis[] = new int[arr.length];
		for(i=1;i<arr.length;i++)
		{
			lis[i]=1;
			for(j=0;j<i;j++)
			{
				
				if(arr[i]>arr[j] && lis[i]<lis[j]+1)
				{
					lis[i]=lis[j]+1;
				}
			}
		}
		for(i=0;i<arr.length;i++)
			if(count<lis[i])
			count=lis[i];
	return count;
	}
	}