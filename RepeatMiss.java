class SortAndFind
{
	private int[] sortArr( int a[])
	{
		int i,j;
		for(i=0;i<a.length-1;i++)
		{
			for(j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
				   int temp= a[j+1];
				   a[j+1]= a[j];
				   a[j]= temp;
				}
			}
		}
		return a;
	}
	private int findRepeatNumber()
	{
		int m=0;
		int j=0;
		int sortedArr[]= new int[5];
		if(sortedArr[j]==sortedArr[j+1])
		{
			sortedArr[j]= m;
		}
	   return sortedArr; 
	}
	
	public static void main(String args[])
	{
		int j=0;
		int givenArr[] = {2,3,2,1,5};
		int sortedArr[] = new SortAndFind().sortArr(givenArr);
		for( j=0;j<5;j++)
		{
			
			 System.out.println(sortedArr[j] + " ");
		}
		 int repeatedNumbers= new SortAndFind().findRepeatNumber();
		 System.out.println( repeatedNumbers + " is repeating number");
		 
	}
}