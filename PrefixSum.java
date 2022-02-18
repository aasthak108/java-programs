class PrefixSum
{
 public int[] prefixadd(int a[])	
 {
	int sum[]= new int[4]; 
   sum[0]=a[0];
   int i;
  for(i=1;i<a.length;i++)
	{
	 sum[i] =sum[i-1]+a[i];
	}
  return sum;
 }
 public static void main(String args[])
 {
 int a[]={10,20,5,15};
 int arr[]=new PrefixSum().prefixadd(a);
 for(int i=0;i<a.length;i++)
 {
  System.out.print(arr[i]+ " ");
 }
}
}