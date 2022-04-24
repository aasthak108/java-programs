class Inversion
{
public static void main(String args[])
{
 int arr[] = {2,4,5,3,5};
 int count =0;
 for(int i=0;i<5;i++)
 {
	for(int j =1 ;j<5;j++)
	{
		if(arr[i] >arr[j] && i<j)
		{
		 count = count+1;
		}
	}
}
System.out.println(""+count);
}
}
		