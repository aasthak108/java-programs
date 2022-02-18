class Occurance
{	
      public static int occNo(int arr[],int x)
    {
        int count=0;
	    for(int i=0;i<arr.length;i++)
			if( x == arr[i])
			count++;
		    return count;	
    }
public static void main(String args[])
{
    int x = 2;
	int arr[]= {1,1,2,2,2,2,3};
	{
		System.out.println(occNo(arr,x));
	}
}
}
   