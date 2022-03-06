class PeakElement
{
	public static int[] getPeakElement(int arr[])
	{
		int i;
		int j=0;
		int newArr[] = new int[7];	
		for(i=0;i<arr.length;i++)
		{
			// Case 1
			if(i==0 && arr[i]>arr[i+1])
			{
				newArr[j]=arr[i];
					j++;
				
			}
			// Case 2
			else if(i==arr.length-1 && arr[i]>arr[i-1])
			{
				newArr[j]= arr[i];
					j++;
			}
			// Case 3
			if( i!=0 && i!=arr.length-1)
			{
		     if(arr[i]>=arr[i+1] && arr[i]>=arr[i-1])
				{
					newArr[j] = arr[i];
					j++;
				}
			}
		}
	    return newArr;	
	}
	
	public static void main(String args[])
	{
		int arr[]={40,20,15,2,23,90,67};
		int reqArr[]=new PeakElement().getPeakElement(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(reqArr[i] + " is the required element(s)");
		}
	}
}
 
 