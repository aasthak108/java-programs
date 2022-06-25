import java.io.*;
import java.util.*;
import java.lang.*;

class MaxSubArraySum
{
	public static int maxSubArraySum(int arr[])
	{
		int size = arr.length;
		int max = Integer.MIN_VALUE;
		int curr = 0;
		for(int i=0;i<size;i++)
		{
			curr = curr +arr[i];
			if(max<curr)
			{
				max=curr;
			}
			if(curr<0)
			{
				curr =0;
			}
		}
		return max;
	}
	public static void main(String args[])
	{
		int arr[] ={-2,-3,-4,0,-2,-1,-5,-3};
		System.out.println("The maximum sum is"+maxSubArraySum(arr));
	}
}
		
		